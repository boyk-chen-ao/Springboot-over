package com.mybatis.code.demo.mailboot;

import com.mybatis.code.demo.DemoApplicationTests;
import com.mybatis.code.demo.mailboot.freemarker.FreeMarkerMailService;
import com.mybatis.code.demo.mailboot.html.HtmlMailService;
import com.mybatis.code.demo.mailboot.simple.SimpleMailService;
import freemarker.template.TemplateException;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MailTest extends DemoApplicationTests {

    @Autowired
    private SimpleMailService simpleMailService;

    @Autowired
    private HtmlMailService htmlMailService;

    @Autowired
    private FreeMarkerMailService freeMarkerMailService;

    @Test
    public void sendSimpleMail(){
        simpleMailService.sendSimpleMail("测试Springboot发送邮件", "发送邮件...");
    }

    @Test
    public void testHtmlMail() throws MessagingException {

        Map<String, String> attachmentMap = new HashMap<>();
        attachmentMap.put("附件.jpg", "C:\\Users\\Administrator\\Desktop\\test.jpg");

        htmlMailService.sendHtmlMail("测试Springboot发送带附件的邮件", "欢迎进入<a href=\"http://www.baidu.com\">百度首页</a>", attachmentMap);

    }

    @Test
    public void testFreemarkerMail() throws MessagingException, IOException, TemplateException {

        Map<String, Object> params = new HashMap<>();
        params.put("username", "Cas");

        freeMarkerMailService.sendTemplateMail("测试Springboot发送模版邮件", params);

    }

}
