package com.example.chan.controller;

import com.example.chan.kafka.KafkaMessageProducer;
import com.example.chan.kafka.config.KafkaProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private KafkaProducer kafkaProducer;

    private KafkaMessageProducer kafkaMessageProducer;

    public StudentController(KafkaProducer kafkaProducer, KafkaMessageProducer kafkaMessageProducer) {
        this.kafkaProducer = kafkaProducer;
        this.kafkaMessageProducer = kafkaMessageProducer;
    }

    @PostMapping("kafka")
    void postMessage(@RequestParam(name = "message")  String message){
        kafkaMessageProducer.sendMessage("topic_message", message);
    }
}
