package com.mybatis.code.demo.thirdapi.jieshun;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.security.MessageDigest;
import java.util.ArrayList;

public class JieShunApiTest {
    public static void main(String[] args) throws Exception {
        // 接口地址(固定)
        String url = "http://cloud.jslife.cn:port/as";
        // 客户号（固定）
        String cid = "00001";
        // 接口版本号（固定）
        String v = "1.0";
        // 参数
        String p = "{\"serviceId\":\"common.queryuserinfo\", \"userId\":\"00001\"}";
        // 生成MD5签名
        MessageDigest md5Tool = MessageDigest.getInstance("MD5");
        byte[] md5Data = md5Tool.digest(p.getBytes("UTF-8"));
        String sn = toHexString(md5Data);
        // 令牌
        String tn = "";

        // 构造参数
        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(url);
        ArrayList<NameValuePair> list = new ArrayList<NameValuePair>();
        list.add(new BasicNameValuePair("cid", cid));
        list.add(new BasicNameValuePair("tn",tn));
        list.add(new BasicNameValuePair("v", v));
        list.add(new BasicNameValuePair("p",p));
        list.add(new BasicNameValuePair("sn",sn));
        HttpEntity en = new UrlEncodedFormEntity(list, HTTP.UTF_8);
        post.setEntity(en);

        // 发送消息和处理结果
        HttpResponse response = client.execute(post);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            System.out.println("执行成功！");
            String s = EntityUtils.toString(response.getEntity());
            System.out.println(s);
        } else {
            System.out.println("执行失败！");
        }
    }
    private static String toHexString(byte[] bytes) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < bytes.length; i++) {
            buffer.append(String.format("%02X", bytes[i]));
        }
        return buffer.toString();
    }
}
