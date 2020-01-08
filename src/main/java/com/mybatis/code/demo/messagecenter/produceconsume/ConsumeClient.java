package com.mybatis.code.demo.messagecenter.produceconsume;

import com.mybatis.code.demo.messagecenter.MqClient;

public class ConsumeClient {

    public static void main(String[] args) throws Exception {
        MqClient client = new MqClient();
        String message = client.consume();

        System.out.println("获取的消息为：" + message);
    }

}
