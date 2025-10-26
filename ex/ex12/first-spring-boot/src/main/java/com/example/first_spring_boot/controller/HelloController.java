package com.example.first_spring_boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World! Welcome in the Spring Boot.";
    }
}