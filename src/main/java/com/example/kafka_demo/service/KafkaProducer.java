package com.example.kafka_demo.service;

import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class KafkaProducer {

  private static final String TOPIC = "exam";
  private final KafkaTemplate<String, String> kafkaTemplate;

  public void sendMessage(String message) {
    System.out.println(String.format("Produce message : %s", message));
    this.kafkaTemplate.send(TOPIC, message);
  }
}
