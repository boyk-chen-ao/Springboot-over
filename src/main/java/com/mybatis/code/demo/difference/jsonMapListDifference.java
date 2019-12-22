package com.mybatis.code.demo.difference;

import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * JSON 和 Map的相同点就是 key,value的方式存储的, 而JSON精确的说键值只支持String(也可以存数值,但是数值存进去,取出来还是String),Map键值都可以存储对象.
 * 键值对的存储结构你自己也可以写.
 */
public class jsonMapListDifference {

    public static void main(String []args) {

        jsonMapListDifference jsonMapListDifference = new jsonMapListDifference();
        jsonMapListDifference.test1();
        jsonMapListDifference.test2();

    }

    private void test1(){
        String soap = "1111";
        List<String> list = new ArrayList<>();
        JSONObject param1 = new JSONObject();
        Map<String, String> param0 = new HashMap<String, String>();
        list.add(soap);
        list.add(soap);

        // json或者map，如果有相同的key，那么赋值，会被覆盖
        param1.put("soap",soap);
        param1.put("soap","2222");

        param0.put("soap",soap);
        param0.put("soap","3333");

        System.out.println("这是list的输出：" + list);
        System.out.println("这是json的输出：" + param1);
        System.out.println("这是map的输出：" + param0);
        System.out.println("--------------------------");
    }

    private void test2(){
        String soap = "1111";
        List<String> list = new ArrayList<>();
        JSONObject param1 = new JSONObject();
        Map<String, Object> param0 = new HashMap<String, Object>();
        list.add(soap);
        list.add(soap);

        param1.put("soaf",soap);
        param1.put("soap","2222");

        param0.put("soaf",soap);
        param0.put("soap","3333");

        System.out.println("这是list的输出：" + list);
        System.out.println("这是json的输出：" + param1);
        System.out.println("这是map的输出：" + param0);
    }



}
