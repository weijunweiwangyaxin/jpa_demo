package com.spirng_jpa.jpa_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                /*swagger访问的地址*/
                .host("localhost:8081")
                .apiInfo(apiInfo())
                .select()
                /*使用了swagger注解的包的位置*/
                .apis(RequestHandlerSelectors.basePackage("com.spirng_jpa.jpa_demo.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                /*头信息*/
                .title("jpa_Demo")
                /*介绍*/
                .description("jpa_测试接口")
                .version("1.0")
                .build();
    }
}