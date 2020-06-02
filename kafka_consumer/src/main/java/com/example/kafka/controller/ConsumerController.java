package com.example.kafka.controller;

import com.example.kafka.service.KafkaConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private KafkaConsumer kafkaConsumer;

    @GetMapping("/messages")
    public List<String> getAllMessages() {
        return kafkaConsumer.getAllMessages();
    }
}
