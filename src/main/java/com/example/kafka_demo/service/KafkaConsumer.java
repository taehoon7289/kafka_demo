package com.example.kafka_demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    /**
     * DM(이메일, 푸시, 문자 등) 이점
     * @param message
     */

    @KafkaListener(topics = "exam", groupId = "foo")
    public void consume(String message) {
        System.out.println(String.format("Consumed message : %s", message));
    }
}
