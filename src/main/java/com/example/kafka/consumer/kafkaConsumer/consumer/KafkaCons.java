package com.example.kafka.consumer.kafkaConsumer.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaCons {

    private final Logger LOGGER = LoggerFactory.getLogger(KafkaCons.class);

    @KafkaListener(topics = "test", groupId = "1")
    public void receive(String message) {
       LOGGER.info("message {}", message);
    }
}
