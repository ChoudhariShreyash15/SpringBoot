package com.example.Oct8_RabbitMQ.Controller;

import com.example.Oct8_RabbitMQ.Service.Producer.JsonMessageProducer;
import com.example.Oct8_RabbitMQ.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rabbit")
public class JsonMessageController {

    @Autowired
    private JsonMessageProducer jsonMessageProducer;

    @PostMapping("/json")
    public ResponseEntity<String> sendJsonMessage(@RequestBody User user){
        jsonMessageProducer.sendMessage(user);
        return ResponseEntity.ok("Json message sent to RabbitMQ");
    }
}
