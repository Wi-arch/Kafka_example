package com.example.kafka.controller;

import com.example.kafka.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping("/publish/{message}")
    public String publishString(@PathVariable("message") String message) {
        kafkaProducer.publishMessage(message);
        return message + " successfully published";
    }
}
