package com.wangrollin.springkafkagetstarted.producer;

import com.wangrollin.avro.generated.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class MyProducer {

    @Autowired
    private KafkaTemplate<Object, Object> template;

//    @PostConstruct
//    public void produceMsg() {
//
//        System.out.println("start");
//        this.template.send("users", "second user");
//        System.out.println("end");
//    }

//    @PostConstruct
//    public void produceMsg() {
//
//        System.out.println("start");
//        User user = new User("name1", 1);
//        this.template.send("avroUsers", user.getName(), user);
//        System.out.println("end");
//    }
}
