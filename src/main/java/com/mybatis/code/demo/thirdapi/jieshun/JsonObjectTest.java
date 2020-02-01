package com.mybatis.code.demo.thirdapi.jieshun;

import net.sf.json.JSONObject;

public class JsonObjectTest {
    public static void main(String[] args) {

        //创建JsonObject
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("parkCodes", "g3v3_1");

        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("serviceId", "3c.park.queryparkspace");
        jsonObject1.put("requestType", "DATA");
        jsonObject1.put("attributes", jsonObject);
        System.out.println("jsonObject1：" + jsonObject1);
        System.out.println("jsonObject1：" + jsonObject1.toString());
    }
}
