package com.mybatis.code.demo.haikang;

import com.alibaba.fastjson.JSONObject;
import com.hikvision.artemis.sdk.ArtemisHttpUtil;
import com.hikvision.artemis.sdk.config.ArtemisConfig;

import java.util.HashMap;
import java.util.Map;

/**
 * 封装后的对接海康接口
 * @author Csa
 * @createTime 2020/1/3 11:13:00
 */
public class GetHikFaceApi {

    public static String GetHikFaceApi(JSONObject jsonBody,String pathEnd) {

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
        final String previewURLsApi = ARTEMIS_PATH + pathEnd;
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
        String body = jsonBody.toJSONString();

        /**
         * STEP6：调用接口
         */
        String result = ArtemisHttpUtil.doPostStringArtemis(path, body, null, null, contentType , null);// post请求application/json类型参数
        return result;
    }

}
