package com.kafkaconsumerservice.kafka;

import com.kafkaconsumerservice.model.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "test-topic", groupId = "my-group")
    public void consume(Message message) {
        System.out.println("🔥 Consumed JSON: " + message.getId() + " - " + message.getContent());
    }
}
