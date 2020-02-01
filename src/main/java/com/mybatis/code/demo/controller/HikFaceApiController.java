package com.mybatis.code.demo.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HikFaceApiController {

    // 人脸资源---------------------------------------------------------------------------------------------------------
    /**
     * 人脸应用服务-人脸资源-按条件查询识别资源---(无参)
     * @return jsonResult
     */
    @GetMapping("/selectRecognition")
    @ResponseBody
    public Object selectRecognition(){

        // 组装请求参数
        JSONObject jsonBody = new JSONObject();
        // 设置接口的URI地址
        String pathEnd = "/api/frs/v1/resource/recognition";

        // 调用接口，放回结果，转为json格式
//        String result = GetHikFaceApi.GetHikFaceApi(jsonBody,pathEnd);
//        JSONObject jsonResult = JSONObject.parseObject(result);

//        return jsonResult;
        return "";
    }

    // 人脸管理---------------------------------------------------------------------------------------------------------
    /**
     * 人脸应用服务-人脸管理-人脸分组管理-按条件查询人脸分组---(无参)
     * @return jsonResult
     */
    @GetMapping("/selectFaceGroup")
    @ResponseBody
    public Object selectFaceGroup(){

        // 组装请求参数
        JSONObject jsonBody = new JSONObject();
        // 设置接口的URI地址
        String pathEnd = "/api/frs/v1/face/group";

        // 调用接口，放回结果，转为json格式
//        String result = GetHikFaceApi.GetHikFaceApi(jsonBody,pathEnd);
//        JSONObject jsonResult = JSONObject.parseObject(result);
//
//        return jsonResult;
        return "";
    }

//    /**
//     * 人脸应用服务-人脸管理-人脸分组管理-按条件查询人脸分组---(无参)
//     * @return jsonResult
//     */
//    @GetMapping("/single")
//    @ResponseBody
//    public Object selectFaceGroup(){
//
//        // 组装请求参数
//        JSONObject jsonBody = new JSONObject();
//        // 设置接口的URI地址
//        String pathEnd = "/api/frs/v1/face/group";
//
//        // 调用接口，放回结果，转为json格式
//        String result = GetHikFaceApi.GetHikFaceApi(jsonBody,pathEnd);
//        JSONObject jsonResult = JSONObject.parseObject(result);
//
//        return jsonResult;
//    }


//    public ParamRequest getParamRequest(HttpServletRequest request, String url){
//        ParamRequest paramRequest = ParamRequest.builder()
//                .host(request.getHeader("hosts"))
//                .appKey(request.getHeader("appKey"))
//                .appSecret(request.getHeader("appSecret"))
//                .build();
//        paramRequest.setUrl(url);
//
//        return paramRequest;
//    }

}
