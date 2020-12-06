package com.zh.config;

import com.google.common.base.Predicates;
import com.zh.annotation.SwaggerUIAnncation;
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
public class SwaggerConfig {

    @Bean
    public Docket docket(){

        //apiInfo构建信息
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();

        apiInfoBuilder.title("纵横家管理文档API");
        apiInfoBuilder.version("1.0");
        Contact context=new Contact("京东","http://www.jindong.com","admin@jindong.com");
        apiInfoBuilder.contact(context);
        apiInfoBuilder.description("这个给前端访问的api");

        //apiInfo对象，Swagger-ui.html 上面配置信息都在此配置
        ApiInfo apiInfo = apiInfoBuilder.build();

        //设定一个版本号
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)//配置信息
                .select()
                //配置要生成api文档的包（配置以后就只会生成这个包下面的类的api文档）
                //.apis(RequestHandlerSelectors.basePackage("com.zh.api"))
                //设置贴过对应注解的才生成Api
                //.apis(RequestHandlerSelectors.withMethodAnnotation(SwaggerUIAnncation.class))
                //注解取反配置（贴上注解的不会生成，没有贴上的就生成）
                //.apis(Predicates.not(RequestHandlerSelectors.withMethodAnnotation(SwaggerUIAnncation.class)))
                .paths(Predicates.or(
                        PathSelectors.regex("/user/.*")
                ))
                .build();


        return docket;
    }
}
