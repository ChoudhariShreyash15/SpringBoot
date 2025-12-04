package com.example.Oct9_TypesOfExchange_RabbitMQ.configuration;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class RabbitConfig {

    // ==== QUEUES ====
    @Bean
    public Queue directQueue() {
        return new Queue("directQueue");
    }

    @Bean
    public Queue fanoutQueue1() {
        return new Queue("fanoutQueue1");
    }

    @Bean
    public Queue fanoutQueue2() {
        return new Queue("fanoutQueue2");
    }

    @Bean
    public Queue topicQueue() {
        return new Queue("topicQueue");
    }

    @Bean
    public Queue headerQueue() {
        return new Queue("headerQueue");
    }

    // ==== EXCHANGES ====
    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange("direct-exchange");
    }

    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange("fanout-exchange");
    }

    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange("topic-exchange");
    }

    @Bean
    public HeadersExchange headersExchange() {
        return new HeadersExchange("headers-exchange");
    }

    // ==== BINDINGS ====
    @Bean
    public Binding directBinding(Queue directQueue, DirectExchange directExchange) {
        return BindingBuilder.bind(directQueue).to(directExchange).with("payment");
    }

    @Bean
    public Binding fanoutBinding1(Queue fanoutQueue1, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(fanoutQueue1).to(fanoutExchange);
    }

    @Bean
    public Binding fanoutBinding2(Queue fanoutQueue2, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(fanoutQueue2).to(fanoutExchange);
    }

    @Bean
    public Binding topicBinding(Queue topicQueue, TopicExchange topicExchange) {
        return BindingBuilder.bind(topicQueue).to(topicExchange).with("order.*");
    }

    @Bean
    public Binding headerBinding(Queue headerQueue, HeadersExchange headersExchange) {
        Map<String, Object> map = new HashMap<>();
        map.put("type", "email");
        return BindingBuilder.bind(headerQueue).to(headersExchange).whereAll(map).match();
    }
}