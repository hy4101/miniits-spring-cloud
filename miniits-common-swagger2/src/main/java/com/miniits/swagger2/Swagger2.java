package com.miniits.swagger2;

import com.google.common.collect.Sets;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * @author: wq
 * @Date: 2017/10/5
 * @Time: 20:55
 * <p>
 * Description:
 * ***
 */

@Configuration
@EnableSwagger2
public class Swagger2 {
//
//    @Bean
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
////                .apis(RequestHandlerSelectors.basePackage("com.miniits.xx.controler"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("Spring Boot中使用Swagger2构建RESTful APIs")
//                .description("更多Spring Boot相关文章请关注：http://www.miniits.com/")
//                .termsOfServiceUrl("http://www.miniits.com/")
//                .contact("迷你科技")
//                .version("1.0")
//                .build();
//    }

    @Bean
    public Docket configSpringfoxDocketForAll() {
        return new Docket(DocumentationType.SWAGGER_2)
                .produces(Sets.newHashSet("application/json", "application/xml"))
                .consumes(Sets.newHashSet("application/json", "application/xml"))
                .protocols(Sets.newHashSet("http"/*, "https"*/))
                .forCodeGeneration(true)
                .select()
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    //页面头部api信息配置
    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "SpringMVC REST API文档",
                "使用Swagger UI构建SpringMVC REST风格的可视化文档",
                "1.0.0",
                "http://localhost:8080/v2/api-docs",
                "jkgeekjack@163.com",
                "Apache License",
                "http://www.apache.org/licenses/LICENSE-2.0.html"
        );
        return apiInfo;
    }
}
