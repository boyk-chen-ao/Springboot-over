//package com.mybatis.code.demo.test;
//
//import lombok.extern.slf4j.Slf4j;
//import net.sf.json.JSONObject;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.net.URI;
//import java.util.Objects;
//
//@RestController
//@Slf4j
//public class RestFulTest {
//
//    public static void main(String[] args) {
//        // 构建URI
//        URI uri = new URIBuilder()
//                .setScheme("http")
//                .setHost(IP)
//                .setPath(path)
//                .setParameter("userMobile", user.getUserMobile())
//                .setParameter("userId", String.valueOf(user.getUserId()))
//                .setParameter("channelId", String.valueOf(channelId))
//                .setParameter("messageContent", messageContent)
//                .build();
//        log.info("添加消息构建URi成功,URI:{}",uri.toString());
//
//        // 获取返回的JSON
//        JSONObject resultJson = getHttpResponse(uri);
//        if(Objects.nonNull(resultJson.get("code")) && result.;Json.get("code").equals(1)){
//            log.info("========================插入Message并提醒APP成功==================");
//    }
//
//        private JSONObject getHttpResponse(URI uri){
//            try(CloseableHttpClient client = HttpClients.createDefault()){
//                HttpGet httpget = new HttpGet(uri);
//                try(CloseableHttpResponse closeableHttpResponse = client.execute(httpget)) {
//                    StatusLine statusLine = closeableHttpResponse.getStatusLine();
//                    if(statusLine.getStatusCode() == HttpStatus.SC_OK) {
//                        // 获取Http实体
//                        HttpEntity entity = closeableHttpResponse.getEntity();
//                        // 获取输入流并读取全部的信息
//                        InputStream inputStream = entity.getContent();
//                        StringBuilder stringBuilder = new StringBuilder();
//                        byte[] buf = new byte[1024];
//                        int length;
//                        while ((length = inputStream.read(buf)) != -1) {
//                            stringBuilder.append(new String(buf, 0, length, StandardCharsets.UTF_8));
//                        }
//                        inputStream.close();
//                        // 将读取到的信息转化为JSON
//                        log.info("StringBuilder Info:{}", stringBuilder);
//                        return JSONObject.fromObject(stringBuilder.toString());
//                    }else{
//                        log.info("URI:{} 的远程连接出错,错误码为:{}",uri,statusLine.getStatusCode());
//                        return JSONObject.fromObject("{\"message\":\"远程连接出错\"}");
//                    }
//                }
//            }catch (Exception e){
//                e.printStackTrace();
//                log.info("URI:{} 的远程连接出错",uri);
//                return JSONObject.fromObject("{\"message\":\"远程连接出错\"}");
//            }
//        }
//
//}
