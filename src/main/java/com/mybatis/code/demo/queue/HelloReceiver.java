package com.mybatis.code.demo.queue;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Description: 接收者
 * @Author: Csa
 * @Version: 1.0
 */
@Component
public class HelloReceiver {

    @RabbitHandler
    @RabbitListener(queues = "hello")
    public void processTest1(String hello) {
        System.out.println("Receiver1  : " + hello);
    }

    @RabbitHandler
    @RabbitListener(queues = "hello")
    public void processTest2(String hello) {
        System.out.println("Receiver2  : " + hello);
    }

    @RabbitHandler
    @RabbitListener(queues = "hello")
    public void processTest3(String hello) {
        System.out.println("Receiver3  : " + hello);
    }

    @RabbitHandler
    @RabbitListener(queues = "testQueue")
    public void processTest4(String hello) {
        System.out.println("ReceiverTest  : " + hello);
    }

    // topic--------------------------------------------

//    @RabbitHandler
//    @RabbitListener(queues = "topic.okong")
//    public void topicOkong(String message) {
//        System.out.println("Okong接收  : " + message);
//    }
//
//    @RabbitHandler
//    @RabbitListener(queues = "topic.qune")
//    public void topicQune(String message) {
//        System.out.println("Qune接收  : " + message);
//    }

}
