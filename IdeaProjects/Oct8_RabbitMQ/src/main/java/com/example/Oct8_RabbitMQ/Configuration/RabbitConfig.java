package com.example.Oct8_RabbitMQ.Configuration;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    public static final String QUEUE = "queue";
    public static final String JSON_QUEUE = "json.queue";
    public static final String EXCHANGE = "topic.exchange";
    public static final String DIRECT_EXCHANGE = "direct.exchange";
    public static final String ROUTING_KEY = "routingKey";
    public static final String DIRECT_ROUTING_KEY = "direct.routingKey";
    public static final String JSON_ROUTING_KEY = "json.routingKey";

//    @Value("${rabbitmq.queue.name}")
//    private String queue;

    @Bean
    public Queue queue() {
        return new Queue(QUEUE, true);
    }

    @Bean
    public Queue jsonQueue(){
        return new Queue(JSON_QUEUE);
    }

    //=============================Direct Exchange================================//
    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange(DIRECT_EXCHANGE);
    }

    @Bean
    public Binding binding(Queue queue, DirectExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(DIRECT_ROUTING_KEY);
    }

    //=============================Topic Exchange=================================//
    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(EXCHANGE);
    }

    @Bean
    public Binding bindingTopic(Queue jsonQueue, TopicExchange exchange) {
        return BindingBuilder.bind(jsonQueue).to(exchange).with(ROUTING_KEY);
    }

    //=============================Json Binding===================================//
    @Bean
    public Binding jsonBinding(){
        return BindingBuilder.bind(jsonQueue()).to(exchange()).with(JSON_ROUTING_KEY);
    }

    @Bean
    public MessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public AmqpTemplate amqpTemplate(ConnectionFactory connectionFactory){
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(messageConverter());
        return rabbitTemplate;
    }
}
