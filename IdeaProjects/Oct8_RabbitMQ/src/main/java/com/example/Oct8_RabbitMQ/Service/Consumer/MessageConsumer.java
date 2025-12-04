//package com.example.Oct8_RabbitMQ.Service.Consumer;
//
//import com.example.Oct8_RabbitMQ.Configuration.RabbitConfig;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Service;
//
//@Service
//public class MessageConsumer {
//
//    @RabbitListener(queues = RabbitConfig.QUEUE)
//    public void receiveMessage(String message){
//        System.out.println("Received Message: " + message);
//    }
//}
