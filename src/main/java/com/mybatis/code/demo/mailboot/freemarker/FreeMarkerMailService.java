package com.mybatis.code.demo.mailboot.freemarker;

import freemarker.template.TemplateException;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.Map;

public interface FreeMarkerMailService {
    public void sendTemplateMail(String subject, Map<String, Object> params) throws MessagingException, IOException, TemplateException;
}
