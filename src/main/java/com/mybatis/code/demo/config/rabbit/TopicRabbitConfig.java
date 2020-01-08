package com.mybatis.code.demo.config.rabbit;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Topic
 * Topic 是 RabbitMQ中最灵活的一种方式，可以根据routing_key自由的绑定不同的队列。
 */
@Configuration
public class TopicRabbitConfig {

    @Bean(name = "okong")
    public Queue okong() {
    //创建一个消息队列
    return new Queue("topic.okong");
    }

    @Bean(name = "qune")
    public Queue qune() {
        //创建一个消息队列
        return new Queue("topic.qune");
    }

    @Bean
    TopicExchange topicExchange() {
        return new TopicExchange("topic");//配置路由器为Topic模式
    }

    @Bean
    Binding bindingExchangeA(@Qualifier("okong") Queue okong, TopicExchange topicExchange) {
        // 配置该消息队列的  routingKey
        //topic.* 匹配 第一个.后面的单词    代表      一个    单词
        //比如 topic.asd 会被该消息队列接受 topic.asd.dsf不会被该消息队列接受
        return BindingBuilder.bind(okong).to(topicExchange).with("topic.*");
    }

    @Bean
    Binding bindingExchangeB(@Qualifier("qune") Queue qune, TopicExchange topicExchange) {
        // 配置该消息队列的  routingKey
        //topic.# 匹配 所有.后面的单词     代表     任意    个      单词
        //比如 topic.asd 会被该消息队列接受 topic.asd.dsf也会被该消息队列接受
        return BindingBuilder.bind(qune).to(topicExchange).with("topic.#");
    }

}
