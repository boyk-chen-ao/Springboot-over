package com.mybatis.code.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Api(tags = "测试Swagger2文档接口")
@Controller
public class SwaggerController {

    @ApiOperation(value="获取用户信息", notes="通过id获取user对象")
    @ApiImplicitParam(name = "id",value = "用户id",required = false,dataType = "Long")
    @GetMapping("/getUserInfo")
    @ResponseBody
    public Map<String, Object> getUserInfo(
            @RequestParam(value = "id",required = false)Long id
    ){
        Map<String, Object> map = new HashMap<>();
        map.put("id",String.valueOf(id));
        return map;
    }

    @ApiOperation(value="Post接口测试", notes="Post接口测试")
    @ApiImplicitParam(name = "id",value = "用户id",required = false,dataType = "Long")
    @PostMapping("/postUserInfo")
    @ResponseBody
    public Map<String, Object> postUserInfo(
            @RequestParam(value = "id",required = false)Long id
    ){
        Map<String, Object> map = new HashMap<>();
        map.put("id",String.valueOf(id));
        return map;
    }

}
