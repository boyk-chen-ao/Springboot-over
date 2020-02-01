package com.mybatis.code.demo.test;

import com.alibaba.fastjson.JSON;
import com.mybatis.code.demo.entity.User;
import org.springframework.util.StringUtils;
import springfox.documentation.spring.web.json.Json;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NullPrintTest {
    public static void main(String[] args) {

//        User user = new User();
//        System.out.println(String.valueOf(user.getId()));
//
//        StringBuffer messageContent = new StringBuffer();
//        messageContent.append("尊敬的");
//        messageContent.append(user.getName());
//        messageContent.append("你好，您有一条待处理事项，请登录智慧园区管理平台—我的工作台，进行处理！");
//        System.out.println(messageContent.toString());
//
//        System.out.println(System.currentTimeMillis());
//
//        // contains()-----------------------------------
//        List<String> str = new ArrayList<>();
//        str.add("user");
//        str.add("test");
//        str.add("login");
//        String test = "user";
//        boolean isTrue = str.contains(test);
//
//        System.out.println(isTrue);
//
//        String s = "hello·";
//        if (s instanceof String){
//            System.out.println("s字符串属于字符串类型，是字符串的实例！");
//        }
//        System.out.println("hello·".equals(s));
//
////        Integer n1 = null;
////        Integer n2 = null;
////        if(null == n1 || null == n2){
////            System.out.println(false);
////        }
////        else {
////            System.out.println(n1.equals(n2));
////        }
//
//        int num1 = 1;
//        int num2 = 1;
//        System.out.println(num1 == num2);
//
//        Integer n1 = 2;
//
//        if(!StringUtils.isEmpty(n1)){
//            System.out.println("2");
//        }
//
//        if(Objects.nonNull(n1)){
//            System.out.println("2");
//        }
//
//        Integer n2 = null;
//        if(!Objects.nonNull(n2)){
//            System.out.println("null");
//        }

//        String abc = "";
//        if (Objects.nonNull(abc)){
//            System.out.println(Long.valueOf(abc));
//        }
        String p = "{\"serviceId\":\"common.queryuserinfo\", \"userId\":\"00001\"}";
        System.out.println(JSON.parse(p));

    }
}
