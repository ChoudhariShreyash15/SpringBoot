package com.example.Oct8_RabbitMQ.Controller;

import com.example.Oct8_RabbitMQ.Service.Producer.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rabbit")
public class StringMessageController {

    @Autowired
    private MessageProducer producer;

    @GetMapping("/send/{msg}")
    public String sendMessage(@PathVariable String msg) {
        producer.sendMessage(msg);
        return "Message Sent: " + msg;
    }
}