package com.example.chan.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessageConsumer {

    @KafkaListener(topics = "topic_message", groupId = "my-group-id")
    public void listen(String message){
        System.out.println(message);
    }
}
