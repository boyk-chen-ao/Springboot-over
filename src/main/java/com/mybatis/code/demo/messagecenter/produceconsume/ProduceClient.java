package com.mybatis.code.demo.messagecenter.produceconsume;

import com.mybatis.code.demo.messagecenter.MqClient;

public class ProduceClient {

    public static void main(String[] args) throws Exception {
        MqClient client = new MqClient();

        client.produce("SEND:Hello World");
    }

}
