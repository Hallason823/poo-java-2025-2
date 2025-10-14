package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getAllUsers")
    public List<UserModel> getAllUSers(){
        return userService.getAllUsers();
    }

    @GetMapping("/getUser/{id}")
    public UserModel getUserById(@PathVariable long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/newUser")
    public UserModel addNewUser(@RequestBody UserModel newUser){
        return userService.createUser(newUser);
    }

    @PutMapping("updtate/{id}")
    public String updateUser(@PathVariable long id, @RequestBody UserModel user){
        return "aaa";
    }
    
    @DeleteMapping("/removeUser/{id}")
    public boolean deleteUserByid(@PathVariable long id) {
        deleteUserByid(id);
        return true;
    }

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World!!!";
    }
}