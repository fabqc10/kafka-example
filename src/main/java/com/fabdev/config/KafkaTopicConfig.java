package com.fabdev.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.stereotype.Component;

@Component
public class KafkaTopicConfig {
    @Bean
    public NewTopic amigoscodeTopic(){
        return TopicBuilder.name("amigoscode")
                .build();
    }
}
