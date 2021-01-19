package com.wangrollin.springkafkagetstarted.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class MyProducer {

    @Autowired
    private KafkaTemplate<Object, Object> template;

    @PostConstruct
    public void produceMsg() {

        System.out.println("start");
        this.template.send("users", "second user");
        System.out.println("end");
    }
}
