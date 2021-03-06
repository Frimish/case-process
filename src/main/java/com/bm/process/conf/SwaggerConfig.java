package com.bm.process.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Package com.bm.process.conf
 * @Title: SwaggerConfig.java
 * @Description: TODO
 * @author steven
 * @date 2018年6月1日 下午2:32:08
 * @version V1.0
 * 
 * 重要！如果你的项目引入junit测试，此处需要使用@WebAppConfiguration，
 */
// @WebAppConfiguration
@Configuration
@EnableSwagger2 
@EnableWebMvc
// @ComponentScan(basePackages = "com.comqing.controller.oa") //
// 扫描control所在的package请修改为你control所在package
public class SwaggerConfig {
	String basePackge = "com.bm.process.controller";

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage(basePackge))
				.paths(PathSelectors.any()).build().apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Process  RESTful 接口").description("案件全流程系统开发接口").version("1.0.0").contact("ChenQB")
				.termsOfServiceUrl("http://www.github.com/kongchen/swagger-maven-plugin").license("").licenseUrl("").build();
	}
}
