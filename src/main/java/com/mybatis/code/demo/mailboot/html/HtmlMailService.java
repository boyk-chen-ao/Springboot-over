package com.mybatis.code.demo.mailboot.html;

import javax.mail.MessagingException;
import java.util.Map;

public interface HtmlMailService {
    public void sendHtmlMail(String subject, String text, Map<String, String> attachmentMap) throws MessagingException;
}
