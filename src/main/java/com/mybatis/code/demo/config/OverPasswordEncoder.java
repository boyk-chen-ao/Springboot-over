package com.mybatis.code.demo.config;

import com.mybatis.code.demo.utils.MD5UtilBetter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class OverPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence rawPassword) {

        String salt = MD5UtilBetter.getSalt();
        return MD5UtilBetter.generate((String)rawPassword,salt);
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        System.out.println("用户输入的密码："+rawPassword);
        System.out.println("数据库中加密后的的密码："+encodedPassword);
        System.out.println("用户输入密码和数据库中的密码是否相等："+MD5UtilBetter.verify((String)rawPassword,encodedPassword));
        System.out.println("========================================");

        log.info("=========================用户验证通过，登陆成功！===========================");

        return MD5UtilBetter.verify((String)rawPassword,encodedPassword);
    }

}
