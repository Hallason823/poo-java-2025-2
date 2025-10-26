package com.example.first_spring_boot.controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.first_spring_boot.model.User;
import com.example.first_spring_boot.security.JwtUtil;
import com.example.first_spring_boot.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody Map<String, String> request) {
        User user = userService.registerUser(request.get("name"), request.get("password"));    
        return ResponseEntity.ok(user);
    }
    
    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody Map<String, String> request) {
        Optional<User> user = userService.findByName(request.get("name"));
        if (user.isPresent() && user.get().getPassword().equals(request.get("password"))) {
            String token = JwtUtil.generateToken(user.get().getName());
            return ResponseEntity.ok(Map.of("token", token));
        }
        return ResponseEntity.status(401).body("invalid credentials");
    }
}
