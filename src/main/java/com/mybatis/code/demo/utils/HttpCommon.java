package com.mybatis.code.demo.utils;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;
import net.sf.json.util.JSONStringer;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

/**
 * http访问的共有组件 2.0
 *
 * @author 顾继钞
 * @date 2018年8月23日 上午11:26:05
 */

public class HttpCommon {

    /**返回值**/
    private final static String CODE = "code";

    /**出错**/
    private final static String ERROR = "error";

    /**错误信息**/
    private final static String EXCEPTION_MESSAGE = "exceptionMessage";

    /**
     * http请求获取
     * @author 顾继钞
     * @date 2018年9月19日 下午7:07:33
     * @param httpUriRequest
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     */
    public static JSONObject doHttpRequest(HttpUriRequest httpUriRequest) throws ClientProtocolException, IOException {
        JSONObject json = new JSONObject();
        CloseableHttpClient httpclient = HttpClients.createDefault();
        CloseableHttpResponse response = httpclient.execute(httpUriRequest);
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            InputStream instream = entity.getContent();
            String result = IOUtils.toString(instream, "UTF-8");
            json = JSONObject.fromObject(result);
        } else {
            json.put("code", "0");
        }
        httpclient.close();
        response.close();
        return json;
    }

    /**
     * http的uri构建
     * @author 顾继钞
     * @date 2018年9月19日 下午7:08:30
     * @param scheme
     * @param host 域名
     * @param path 接口地址
     * @param parameters 参数
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     * @throws URISyntaxException
     */
    public static URI getURI(String scheme, String host, String path, List<NameValuePair> parameters)
            throws ClientProtocolException, IOException, URISyntaxException {
        URI	uri = new URIBuilder().setScheme(scheme).setHost(host).setPath(path).addParameters(parameters)
                .build();
        return uri;
    }



    /**
     * httpGET请求
     *
     * @param url        访问地址 (http://或者 https://)
     * @param path       接口路径
     * @param parameters 参数(Map传参)
     * @param heards     头文件(Map传参)
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     * @throws URISyntaxException
     * @author 顾继钞
     * @date 2018年9月11日 上午9:02:20
     */
    public static JSONObject getHttpRequest(String url, String path, Map<String, String> parameters,
                                            Map<String, String> heards) throws ClientProtocolException, IOException, URISyntaxException {
        String[] urls = url.split("://");
        URIBuilder uri = new URIBuilder().setScheme(urls[0]).setHost(urls[1] + path);
        // 设置url传参
        if (null != parameters) {
            fillUri(uri, parameters);
        }
        HttpGet httpGet = new HttpGet(uri.build());
        // 设置头文件,给httpPost添加http请求头部：包含Content-Type、Accept、source、COOKIE信息
        if (null != heards) {
            for (Map.Entry<String, String> entry : heards.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                httpGet.setHeader(key, value);
            }
        }
        CloseableHttpClient httpclient = HttpClients.createDefault();
        JSONObject json = new JSONObject();
        CloseableHttpResponse response = null;
        try {
            response = httpclient.execute(httpGet);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                InputStream instream = entity.getContent();
                String result = IOUtils.toString(instream, "UTF-8");
                json = JSONObject.fromObject(result);
            }
            if (json.containsKey(ERROR)) {
                json.put(CODE, 0);
            }
            response.close();
        } catch (Exception e) {
            json.put(CODE, 0);
            json.put(EXCEPTION_MESSAGE, e.getMessage());
            httpclient.close();
            return json;
        }
        httpclient.close();
        return json;
    }

    /**
     * httpPOST请求
     *
     * @param url        访问地址 (http://或者 https://)
     * @param path       接口路径
     * @param parameters 参数(Map传参)
     * @param heards     头文件(Map传参)
     * @param jsonObject 传递数据(二选一)
     * @param map        传递数据(二选一)
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     * @throws URISyntaxException
     * @author 顾继钞
     * @date 2018年9月11日 上午9:08:45
     */
    public static JSONObject postHttpRequest(String url, String path, Map<String, String> parameters,
                                             Map<String, String> heards, JSONObject jsonObject, Map<String, String> map)
            throws ClientProtocolException, IOException, URISyntaxException {
        String[] urls = url.split("://");
        URIBuilder uri = new URIBuilder().setScheme(urls[0]).setHost(urls[1] + path);
        // 设置url传参
        if (null != parameters) {
            fillUri(uri, parameters);
        }
        HttpPost httpPost = new HttpPost(uri.build());
        // 设置头文件,给httpPost添加http请求头部：包含Content-Type、Accept、source、COOKIE信息
        if (null != heards) {
            for (Map.Entry<String, String> entry : heards.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                httpPost.setHeader(key, value);
            }
        }
        if (null != jsonObject) {
            httpPost = getJsonHttpPostJSON(httpPost, jsonObject);
        } else if (null != map) {
            httpPost = getJsonHttpPostMap(httpPost, map);
        }
        JSONObject json = new JSONObject();
        CloseableHttpClient httpclient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        try {
            response = httpclient.execute(httpPost);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                InputStream instream = entity.getContent();
                String result = IOUtils.toString(instream, "UTF-8");
                System.out.println("result：" + result);
                json = JSONObject.fromObject(result);
            }
            if (json.containsKey(ERROR)) {
                json.put(CODE, 0);
            }
            response.close();
        } catch (Exception e) {
            json.put(CODE, 0);
            json.put(EXCEPTION_MESSAGE, e.getMessage());
            httpclient.close();
            return json;
        }
        httpclient.close();
        return json;
    }

    /**
     * 模拟post传递json格式数据(map格式)
     *
     * @param httpPost
     * @param values
     * @return
     * @throws UnsupportedEncodingException
     * @throws JSONException
     * @author 顾继钞
     * @date 2018年8月23日 上午9:07:23
     */
    public static HttpPost getJsonHttpPostMap(HttpPost httpPost, Map<String, String> values)
            throws JSONException {
        String jsonString;
        // 生成一个JSON格式的字符串，将http全部请求参数设置到httpPost的Entity中
        if (values != null) {
            JSONStringer jsonStringer = (JSONStringer) new JSONStringer().object();
            // 以Set方式遍历Map数据，设置请求参数
            for (Map.Entry<String, String> oneEntry : values.entrySet()) {
                String key = oneEntry.getKey();
                String value = oneEntry.getValue();
                jsonStringer.key(key).value(value);
            }
            jsonStringer.endObject();
            // 将JSON的格式的请求参数列表，转化为字符串格式
            jsonString = jsonStringer.toString();
            // 将该字符串设置为HttpEntity，并设置编码方式
            HttpEntity entity = new StringEntity(jsonString, "UTF-8");
            httpPost.setEntity(entity);
        }
        return httpPost;
    }

    /**
     * 模拟post传递json格式数据(json格式)
     *
     * @param httpPost
     * @param values
     * @return
     * @throws UnsupportedEncodingException
     * @throws JSONException
     * @author 顾继钞
     * @date 2018年8月23日 上午8:59:35
     */
    public static HttpPost getJsonHttpPostJSON(HttpPost httpPost, JSONObject values)
            throws JSONException {
        String jsonString;
        if (null != values) {
            jsonString = values.toString();
            // 将该字符串设置为HttpEntity，并设置编码方式
            HttpEntity entity = new StringEntity(jsonString, "UTF-8");
            httpPost.setEntity(entity);
        }
        return httpPost;
    }

    /**
     * 填充参数
     *
     * @param uri
     * @param parameters
     * @描述
     * @返回值 org.apache.http.client.utils.URIBuilder
     * @创建人 顾继钞
     * @创建时间 2018/9/11 10:12
     */

    public static URIBuilder fillUri(URIBuilder uri, Map<String, String> parameters)
            throws JSONException {
        for (Map.Entry<String, String> entry : parameters.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            uri.addParameter(key, value);
        }
        return uri;
    }

}
