package com.mybatis.code.demo.config.javadoc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @Author: Csa
 */
// 用@Configuration注解该类，等价于XML中配置beans；用@Bean标注方法等价于XML中配置bean。
@Configuration
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // 配置controller包的路径
                .apis(RequestHandlerSelectors.basePackage("com.mybatis.code.demo.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("springboot利用swagger2构建api文档")
                .description("简单优雅的restfun风格，Csa-api")
                .termsOfServiceUrl("NO terms of service")
                .version("1.0.0")
                .build();
    }

}
