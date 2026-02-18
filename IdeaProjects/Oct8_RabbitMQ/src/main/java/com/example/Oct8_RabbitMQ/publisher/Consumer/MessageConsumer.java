package com.example.Oct8_RabbitMQ.publisher.Consumer;

import com.example.Oct8_RabbitMQ.configuration.RabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    @RabbitListener(queues = RabbitConfig.QUEUE)
    public void receiveMessage(String message){
        System.out.println("Received Message: " + message);
    }

    @RabbitListener(queues = RabbitConfig.QUEUE1)
    public void receiveMessage1(String message){
        System.out.println("Received Message: " + message);
    }
}
