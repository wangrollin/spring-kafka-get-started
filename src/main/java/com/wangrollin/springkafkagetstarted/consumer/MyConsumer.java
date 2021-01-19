package com.wangrollin.springkafkagetstarted.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MyConsumer {

    @KafkaListener(id = "fooGroup", topics = "users")
    public void listen(String userMsg) {

        System.out.println("Received: " + userMsg);
    }
}
