package com.example.Oct8_RabbitMQ.Service.Producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    private static final String EXCHANGE = "topic.exchange";
    private static final String ROUTING_KEY = "routingKey";

    public void sendMessage(String message){
        rabbitTemplate.convertAndSend(EXCHANGE, ROUTING_KEY, message);
        System.out.println("Sent message: " + message);
    }
}