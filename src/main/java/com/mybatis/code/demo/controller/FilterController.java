package com.mybatis.code.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class FilterController {

    @GetMapping("/failed")
    @ResponseBody
    public Map<String, String> failed(){

        Map<String, String> map = new HashMap<>();
        map.put("code", "-1");
        map.put("msg", "请求错误");
        return map;
    }

    @GetMapping("/success/info")
    @ResponseBody
    public Map<String, String> success(){

        Map<String, String> map = new HashMap<>();
        map.put("code", "1");
        map.put("msg", "请求成功");
        return map;
    }

}
