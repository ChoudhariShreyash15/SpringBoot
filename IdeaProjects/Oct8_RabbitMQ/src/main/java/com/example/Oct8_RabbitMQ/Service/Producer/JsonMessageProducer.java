package com.example.Oct8_RabbitMQ.Service.Producer;

import com.example.Oct8_RabbitMQ.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JsonMessageProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    private static final String EXCHANGE = "topic.exchange";
    private static final String JSON_ROUTING_KEY = "routingKey";
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonMessageProducer.class);

    public void sendMessage(User user){
        LOGGER.info(String.format("Json message sent successfully -> %s", user.toString()));
        rabbitTemplate.convertAndSend(EXCHANGE, JSON_ROUTING_KEY, user);
    }
}
