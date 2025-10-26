package com.example.first_spring_boot.service;

import org.springframework.stereotype.Service;

import com.example.first_spring_boot.repository.MessageRepository;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public String obtainMessage() {
        return messageRepository.obtainMessage();
    }
}