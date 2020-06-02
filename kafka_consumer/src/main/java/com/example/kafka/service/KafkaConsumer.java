package com.example.kafka.service;

import java.util.List;

public interface KafkaConsumer {

    List<String> getAllMessages();

    void consume(String message);
}
