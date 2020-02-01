package com.mybatis.code.demo.thirdapi.jieshun.potting;

import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;

@Slf4j
public class JieShunApiUtil {

    @Value("${jsUrl}")
    private static String jsUrl;

    /**
     * 功能描述:调用捷顺业务接口
     *
     * @param token token令牌
     * @param params 传入第三方attributes中的参数
     * @param serviceId 第三方指定的serviceId唯一标识
     * @author Csa
     * @date 2020/1/17 13:55
     * @return
     * @throws Exception
     */
    public static String GetJieShunApiAs(String token,String params,String serviceId) throws Exception{
        // 接口地址(固定)
        String url = jsUrl;
        // 客户号（固定）
        String cid = "00001";
        // 接口版本号（固定）
        String v = "1.0";
        // 参数
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("serviceId", serviceId);
        jsonObject.put("requestType", "DATA");
        jsonObject.put("attributes", params);
        String p = jsonObject.toString();
        // 生成MD5签名
        MessageDigest md5Tool = MessageDigest.getInstance("MD5");
        byte[] md5Data = md5Tool.digest(p.getBytes("UTF-8"));
        String sn = toHexString(md5Data);
        // 令牌
        String tn = token;

        // 构造参数
        HttpClient client = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(url);
        ArrayList<NameValuePair> list = new ArrayList<NameValuePair>();
        list.add(new BasicNameValuePair("cid", cid));
        list.add(new BasicNameValuePair("tn",tn));
        list.add(new BasicNameValuePair("v", v));
        list.add(new BasicNameValuePair("p",p));
        list.add(new BasicNameValuePair("sn",sn));
        HttpEntity en = new UrlEncodedFormEntity(list, StandardCharsets.UTF_8);
        post.setEntity(en);

        // 发送消息和处理结果
        HttpResponse response = client.execute(post);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            log.info("===================执行成功！====================");
            // 返回的是你服务端以流的形式写出的响应正文中的内容
            String s = EntityUtils.toString(response.getEntity());
            log.info("返回的值为："+s);
            return s;
        } else {
            log.info("===================执行失败！====================");
            return "";
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
