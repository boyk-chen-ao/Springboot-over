package com.mybatis.code.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new OverPasswordEncoder();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService)
         .passwordEncoder(passwordEncoder());
        // 这里的passwordEncoder()调用了上面的Bean，返回的是new OverPasswordEncoder()
        // passwoldEncoder是对密码的加密处理，如果user中密码没有加密，则可以不加此方法。注意加密请使用security自带的加密方式。
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        // 退出登录相关配置
        http.logout()
                // 触发注销操作的url
                .logoutUrl("/signOut")
                // 注销成功后跳转的url
                .logoutSuccessUrl("/signOut/success")
                // 指定是否在注销时让HttpSession无效
                .invalidateHttpSession(true);

        http.csrf().disable()//禁用了 csrf 功能
                .authorizeRequests()//限定签名成功的请求
                //对decision和govern和employee 下的接口 需要 EMPLOYEE 或者 ADMIN 权限
                .antMatchers("/decision/**","/govern/**","/employee/**").hasAnyRole("EMPLOYEE","ADMIN")
                //对admin下的接口 需要ADMIN权限（只对admin开放）
                .antMatchers("/admin/**").hasRole("ADMIN")
                //不拦截 oauth 开放的资源（对任何权限开放，甚至没有权限）
                .antMatchers("/oauth/**").permitAll()
                //其他没有限定的请求，允许访问
                .anyRequest().permitAll()
                .and().anonymous()//对于没有配置权限的其他请求允许匿名访问
                .and().formLogin()//使用 spring security 默认登录页面
                .and().httpBasic();//启用http 基础验证

    }

}
