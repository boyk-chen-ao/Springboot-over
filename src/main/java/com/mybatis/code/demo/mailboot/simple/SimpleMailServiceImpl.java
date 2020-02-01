package com.mybatis.code.demo.mailboot.simple;

import com.mybatis.code.demo.mailboot.MailProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SimpleMailServiceImpl implements SimpleMailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Resource
    private MailProperties mailProperties;

    @Override
    public void sendSimpleMail(String subject, String text) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(mailProperties.getFrom());
        mailMessage.setTo(mailProperties.getTo());

        mailMessage.setSubject(subject);
        mailMessage.setText(text);

        javaMailSender.send(mailMessage);
    }

}
