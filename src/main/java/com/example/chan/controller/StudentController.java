package com.example.chan.controller;

import com.example.avro.Student;
import com.example.chan.kafka.KafkaMessageProducer;
import com.example.chan.kafka.config.KafkaProducerConfig;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private KafkaMessageProducer kafkaMessageProducer;

    public StudentController(KafkaProducerConfig kafkaProducer, KafkaMessageProducer kafkaMessageProducer) {
        this.kafkaMessageProducer = kafkaMessageProducer;
    }

    @PostMapping("/kafka")
    void postMessage(@RequestBody  String message){
        kafkaMessageProducer.sendMessage("send_student_avro", "message");
    }
}
