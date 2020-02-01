package com.mybatis.code.demo.controller.justtest;

import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class ParamAndBodyController {

    /**
     * 在后端的同一个接收方法里，@RequestBody与@RequestParam()可以同时使用，@RequestBody最多只能有一个，而@RequestParam()可以有多个。
     */
    @PostMapping("paramAndBodyTest")
    public Map<String,Object> paramAndBodyTest(@RequestParam("abcStr")String abcStr, @RequestBody JSONObject jsonObject){

        String getStr = abcStr;
        String getJson = jsonObject.toString();

        Map<String,Object> map = new HashMap<>();
        map.put("abcStr",getStr);
        map.put("jsonObject",getJson);
        return map;
    }
    // 补充：
    // @RequestBody主要用来接收前端传递给后端的json字符串中的数据的(请求体中的数据的)；
    // GET方式无请求体，所以使用@RequestBody接收数据时，前端不能使用GET方式提交数据，而是用POST方式进行提交。
}
