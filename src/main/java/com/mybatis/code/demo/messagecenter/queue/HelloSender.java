package com.mybatis.code.demo.messagecenter.queue;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Description: 发送者
 * @Author: Csa
 * @Version: 1.0
 */
@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }

    public void sendTest2() {
        String context = "test2 " + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("testQueue", context);
    }

    // topic-----------------------------------------------------------

    public void sendTopic() {
        String context = "messages-----测试数据10";
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("topic", "topic.asd.qune", context);
    }

}
