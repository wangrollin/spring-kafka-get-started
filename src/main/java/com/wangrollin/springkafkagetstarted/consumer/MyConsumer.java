package com.wangrollin.springkafkagetstarted.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.wangrollin.avro.generated.User;

@Service
public class MyConsumer {

//    @KafkaListener(id = "fooGroup", topics = "users")
//    public void listen(String userMsg) {
//
//        System.out.println("Received: " + userMsg);
//    }

    @KafkaListener(id = "avroGroup", topics = "avroUsers")
    public void listen(ConsumerRecord<String, User> record) {

        System.out.println("Received: " + record.value().getName());
    }
}
