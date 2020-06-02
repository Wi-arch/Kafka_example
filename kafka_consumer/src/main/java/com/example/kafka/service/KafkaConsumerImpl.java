package com.example.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class KafkaConsumerImpl implements KafkaConsumer {

    private final List<String> messages = new ArrayList<>();

    @Override
    public List<String> getAllMessages() {
        return Collections.unmodifiableList(messages);
    }

    @Override
    @KafkaListener(topics = "${kafka.topic}", groupId = "${kafka.group-id}")
    public void consume(String message) {
        System.out.println("Consumer get next message >>>" + message);
        messages.add(message);
    }
}
