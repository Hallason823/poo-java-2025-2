package com.example.first_spring_boot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.first_spring_boot.model.User;
import com.example.first_spring_boot.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService() {
        passwordEncoder = new BCryptPasswordEncoder();
    }

    public User registerUser(String name, String password) {
        String passwordCrypt = passwordEncoder.encode(password);
        User user = new User();
        user.setName(name);
        user.setPassword(passwordCrypt);
        return userRepository.save(user);
    }

    public Optional<User> findByName(String name) {
        return userRepository.findByName(name);
    }



}