package com.example.kafka;

import com.example.kafka.config.KafkaTopicConfig;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = KafkaTopicConfig.TOPIC, groupId = "0")
    void listener(String data) {
        System.out.println("Listener received: " + data);
    }
}
