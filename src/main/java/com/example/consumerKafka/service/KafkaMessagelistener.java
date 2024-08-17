package com.example.consumerKafka.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service

public class KafkaMessagelistener {

    Logger log = LoggerFactory.getLogger(KafkaMessagelistener.class);


    @KafkaListener(topics = "Krishna_Topic", groupId = "Kn_1")
    public void consume(String message){
        log.info("consumer consumes the message {}", message);
    }
    @KafkaListener(topics = "Krishna_Topic", groupId = "Kn_2")
    public void consume1(String message){
        log.info("consumer1 consumes the message {}", message);
    }
    @KafkaListener(topics = "Krishna_Topic", groupId = "Kn_3")
    public void consume2(String message){
        log.info("consumer2 consumes the message {}", message);
    }
    @KafkaListener(topics = "Krishna_Topic", groupId = "Kn_4")
    public void consume3(String message){
        log.info("consumer3 consumes the message {}", message);
    }
    @KafkaListener(topics = "Krishna_Topic", groupId = "Kn_5")
    public void consume4(String message){
        log.info("consumer4 consumes the message {}", message);
    }

}
