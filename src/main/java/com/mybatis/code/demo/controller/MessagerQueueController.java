package com.mybatis.code.demo.controller;

import com.mybatis.code.demo.queue.HelloSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MessagerQueueController {

    @Autowired
    HelloSender helloSender;

    @GetMapping("/helloMessager")
    @ResponseBody
    public Object helloMessager(){

        helloSender.send();
        helloSender.sendTest2();
        return "";
    }

    @GetMapping("/topicMessager")
    @ResponseBody
    public Object topicMessager(){

        helloSender.sendTopic();
        return "topic方式~";
    }

}
