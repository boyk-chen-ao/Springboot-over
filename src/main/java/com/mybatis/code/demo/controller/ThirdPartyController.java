package com.mybatis.code.demo.controller;

import com.mybatis.code.demo.utils.HttpCommon;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class ThirdPartyController {

    @GetMapping("/theThirdPartyTest")
    public Object theThirdPartyTest() throws IOException, URISyntaxException {

        // 连接第三方接口所需参数
        String url = "http://198.168.0.164:8083";
        String path = "/querySysRoleExample";
        Map<String, String> map = new HashMap<>();
        map.put("id",String.valueOf(2));

        // 连接第三方接口，获取返回的JSON
        JSONObject resultJson = HttpCommon.getHttpRequest(url,path,map,null);

        log.info("=============================调用第三方接口成功！===========================");

        return resultJson;
    }

}
