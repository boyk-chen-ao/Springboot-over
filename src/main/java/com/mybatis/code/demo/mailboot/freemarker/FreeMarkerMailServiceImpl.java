package com.mybatis.code.demo.mailboot.freemarker;

import com.mybatis.code.demo.mailboot.MailProperties;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.Map;

@Service
public class FreeMarkerMailServiceImpl implements FreeMarkerMailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Resource
    private MailProperties mailProperties;

    @Override
    public void sendTemplateMail(String subject, Map<String, Object> params) throws MessagingException, IOException, TemplateException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        helper.setFrom(mailProperties.getFrom());
        helper.setTo(mailProperties.getTo());

        Configuration configuration = new Configuration(Configuration.VERSION_2_3_28);
        configuration.setClassForTemplateLoading(this.getClass(), "/templates");

        String html = FreeMarkerTemplateUtils.processTemplateIntoString(configuration.getTemplate("mail.ftl"), params);

        helper.setSubject(subject);
        helper.setText(html, true);//重点，默认为false，显示原始html代码，无效果

        javaMailSender.send(mimeMessage);
    }

}
