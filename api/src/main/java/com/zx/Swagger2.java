package com.zx;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swagger2 {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.zx.controller"))
            .paths(PathSelectors.any())
            .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("自心接口文档")//标题
                .description("SpringBoot+swagger2+SwaggerBootstrapUI 接口文档")//描述
                .termsOfServiceUrl("http://www.zixin1.com")//服务url
                .contact(new Contact("Vi的技术博客", "https://www.cnblogs.com/viyoung", "18530069930@163.com")) // 三个参数依次是姓名，个人网站，邮箱
                .version("1.0")//版本
                .build();
    }
}
