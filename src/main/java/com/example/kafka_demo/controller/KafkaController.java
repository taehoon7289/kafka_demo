package com.example.kafka_demo.controller;

import com.example.kafka_demo.service.KafkaProducer;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/kafka")
public class KafkaController {

  private final KafkaProducer producer;

  @PostMapping
  public String sendMessage(@RequestParam("message") String message) {
    this.producer.sendMessage(message);

    return "success";
  }
}
