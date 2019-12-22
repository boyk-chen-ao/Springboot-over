package com.mybatis.code.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InterceptorController {

    @GetMapping("/testInterceptor")
    @ResponseBody
    public String testInterceptor(){
        return "测试-排除拦截";
    }

    @GetMapping("/testExclude")
    @ResponseBody
    public String testExclude(){
        return "测试-排除拦截";
    }

    @GetMapping("/testAddInterceptor")
    @ResponseBody
    public String testAdd(){
        return "测试-添加拦截";
    }

}
