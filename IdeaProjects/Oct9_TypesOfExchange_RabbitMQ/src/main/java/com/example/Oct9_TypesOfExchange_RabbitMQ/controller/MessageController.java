package com.example.Oct9_TypesOfExchange_RabbitMQ.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/send")
public class MessageController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    // Direct Exchange
    @GetMapping("/direct")
    public ResponseEntity<String> sendDirect(@RequestParam String message) {
        rabbitTemplate.convertAndSend("direct-exchange", "payment", message);
        return ResponseEntity.ok("Sent via Direct Exchange: " + message);
    }

    // Fanout Exchange
    @GetMapping("/fanout")
    public ResponseEntity<String> sendFanout(@RequestParam String message) {
        rabbitTemplate.convertAndSend("fanout-exchange", "", message);
        return ResponseEntity.ok("Sent via Fanout Exchange: " + message);
    }

    // Topic Exchange
    @GetMapping("/topic")
    public ResponseEntity<String> sendTopic(@RequestParam String routingKey, @RequestParam String message) {
        rabbitTemplate.convertAndSend("topic-exchange", routingKey, message);
        return ResponseEntity.ok("Sent via Topic Exchange [" + routingKey + "]: " + message);
    }

    // Headers Exchange
    @GetMapping("/header")
    public ResponseEntity<String> sendHeader(@RequestParam String message) {
        Map<String, Object> headers = new HashMap<>();
        headers.put("type", "email");
        rabbitTemplate.convertAndSend("headers-exchange", "", message, m -> {
            headers.forEach((k, v) -> m.getMessageProperties().setHeader(k, v));
            return m;
        });
        return ResponseEntity.ok("Sent via Header Exchange: " + message);
    }
}