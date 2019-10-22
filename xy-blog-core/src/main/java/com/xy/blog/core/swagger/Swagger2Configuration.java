package com.xy.blog.core.swagger;

/**
 * @Author zanhonglei
 * @Date2019/9/11 18:01
 * @Description
 * @Version V1.0
 **/

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2 配置类
 * 在与spring boot 集成时，放在与application.java 同级的目录下
 * 通过@Configuration注解，让spring来加载该配置
 * 再通过@EnableSwagger2注解来启动Swagger2
 */
@Configuration
@EnableSwagger2
public class Swagger2Configuration {


    @Value("${swagger2.enable:false}")
    private boolean swagger2Enable ;

    /**
     * 创建API应用
     * appinfo()增加API相关信息
     * 通过select()函数返回一个ApiSelectorBuilder实例，用来控制那些接口暴露给Swagger来展现
     * 本例采用置顶扫描的包路径来定义指定要建立API的目录
     *
     * @return
     */
    @Bean
    public Docket createRestApi() {
         Docket build = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(swagger2Enable)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xy"))
                .paths(PathSelectors.any()).build();
        return build;
    }


    /**
     * 创建改API的基本信息（这些基本信息会展示在文档页面中）
     * 访问地址： http://项目实际地址/swagger-ui.html
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("APIs")
                .description("了解更多请联系：XXXX")
                .termsOfServiceUrl("http://www.baidu.com")
                .contact("XY")
                .version("1.0")
                .build();
    }
}