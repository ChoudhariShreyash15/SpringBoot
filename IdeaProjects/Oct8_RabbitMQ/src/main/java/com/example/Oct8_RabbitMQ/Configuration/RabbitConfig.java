package com.example.Oct8_RabbitMQ.configuration;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.JacksonJsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    public static final String QUEUE = "queue";
    public static final String QUEUE1 = "queue1";
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
        return new Queue(QUEUE, false);
    }

    @Bean
    public Queue queue1() {
        return new Queue(QUEUE1, false);
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
    public Binding bindingTopic(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY);
    }

//    @Bean
//    public FanoutExchange fanoutExchange(){
//        return new FanoutExchange(DIRECT_EXCHANGE);
//    }
//
//    public Binding bindingFanout(Queue queue, Queue jsonqueue, FanoutExchange fanoutExchange){
//
//    }

    //=============================Json Binding===================================//
    @Bean
    public Binding jsonBinding(){
        return BindingBuilder.bind(jsonQueue()).to(exchange()).with(JSON_ROUTING_KEY);
    }

    @Bean
    public MessageConverter messageConverter(){
        return new JacksonJsonMessageConverter();
//        return new Jackson2JsonMessageConverter(); //Deprecated since version 4.0 and marked for removal
    }

    @Bean
    public AmqpTemplate amqpTemplate(ConnectionFactory connectionFactory){
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(messageConverter());
        return rabbitTemplate;
    }
}
