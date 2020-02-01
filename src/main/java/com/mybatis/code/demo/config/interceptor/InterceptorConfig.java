package com.mybatis.code.demo.config.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
// 继承WebMvcConfigurationAdapter已经过时
// 推荐使用实现WebMvcConfigurer
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private RealizationInterceptor realizationInterceptor;

    //实现拦截器 要拦截的路径以及不拦截的路径
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册自定义拦截器，添加拦截路径和排除拦截路径
        // addPathPatterns这个是添加拦截路径，excludePathPatterns这个是排除拦截的路径多个路径中间用逗号隔开，
        /**
         * SpringMVC 拦截器拦截 /* 和 /** 的区别：
         * /* ： 匹配一级，即 /add , /query 等
         * /** ： 匹配多级，即 /add , /add/user, /add/user/user… 等
         */
        registry.addInterceptor(realizationInterceptor).addPathPatterns("/**").excludePathPatterns("/testInterceptor","/testExclude");
    }

}
