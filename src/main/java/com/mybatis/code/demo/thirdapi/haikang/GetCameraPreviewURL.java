package com.mybatis.code.demo.thirdapi.haikang;

import com.alibaba.fastjson.JSONObject;
import com.hikvision.artemis.sdk.ArtemisHttpUtil;
import com.hikvision.artemis.sdk.config.ArtemisConfig;
import org.apache.http.HttpResponse;

import java.util.HashMap;
import java.util.Map;

public class GetCameraPreviewURL {

    public static HttpResponse GetCameraPreviewURL() {

        /**
         * STEP1：设置平台参数，根据实际情况,设置host appkey appsecret 三个参数.
         */
        ArtemisConfig.host = "117.149.160.79:9016"; // artemis网关服务器ip端口
        ArtemisConfig.appKey = "21045085";  // 秘钥appkey
        ArtemisConfig.appSecret = "CEjALAZkhIZesr2hIorW";// 秘钥appSecret

        /**
         * STEP2：设置OpenAPI接口的上下文
         */
        final String ARTEMIS_PATH = "/artemis";

        /**
         * STEP3：设置接口的URI地址
         */
        final String previewURLsApi = ARTEMIS_PATH + "/api/resource/v1/person/picture";
//        final String previewURLsApi = ARTEMIS_PATH + "/api/frs/v1/resource/recognition";
        Map<String, String> path = new HashMap<String, String>(2) {
            {
                put("http://", previewURLsApi);//根据现场环境部署确认是http还是https
            }
        };

        /**
         * STEP4：设置参数提交方式
         */
        String contentType = "application/json";

        /**
         * STEP5：组装请求参数
         */
        JSONObject jsonBody = new JSONObject();
        jsonBody.put("picUri","/pic?9ddd37i21-e*85d48781b268--d11d20bfefbdfiab4*=5d7i5s1*=idp1*=tdpe*m5i13=3-71661541z11as=9i08=");
        jsonBody.put("serverIndexCode","cd431703-8048-4d29-a984-dd6bc9165e3c");
//        jsonBody.put("cameraIndexCode", "748d84750e3a4a5bbad3cd4af9ed5101");
//        jsonBody.put("streamType", 0);
//        jsonBody.put("protocol", "rtsp");
//        jsonBody.put("transmode", 1);
//        jsonBody.put("expand", "streamform=ps");
        String body = jsonBody.toJSONString();
        /**
         * STEP6：调用接口
         */
//        String result = ArtemisHttpUtil.doPostStringArtemis(path, body, null, null, contentType , null);// post请求application/json类型参数
          HttpResponse httpResponse =  ArtemisHttpUtil.doPostStringImgArtemis(path, body, null, null, contentType , null);
        return httpResponse;

//        return result;
    }

    public static void main(String[] args) {
        HttpResponse httpResponse = GetCameraPreviewURL();

//        httpResponse.getHeaders("Location");

//        System.out.println( httpResponse.getHeaders("Location"));
//        String result = GetCameraPreviewURL();
//        System.out.println("result结果示例: " + result);

    }
}
