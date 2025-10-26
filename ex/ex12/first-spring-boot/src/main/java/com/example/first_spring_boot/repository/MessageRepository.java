package com.example.first_spring_boot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MessageRepository {

    public String obtainMessage() {
        return "Hello, respository";
    }
    
}
