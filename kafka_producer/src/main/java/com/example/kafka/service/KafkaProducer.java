package com.example.kafka.service;

public interface KafkaProducer {

    void publishMessage(String message);
}
