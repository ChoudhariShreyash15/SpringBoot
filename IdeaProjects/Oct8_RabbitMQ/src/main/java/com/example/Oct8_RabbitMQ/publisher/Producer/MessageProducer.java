package com.example.Oct8_RabbitMQ.publisher.Producer;

import com.example.Oct8_RabbitMQ.configuration.RabbitConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(String message){
        rabbitTemplate.convertAndSend(RabbitConfig.DIRECT_EXCHANGE,RabbitConfig.DIRECT_ROUTING_KEY, message);
        System.out.println("Sent message: " + message);
    }
}