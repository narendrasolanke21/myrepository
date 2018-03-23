package com.example.demo;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {                            
	    @Bean
	    public Docket api() { 
	        return new Docket(DocumentationType.SWAGGER_2)  
	          .groupName("My Rest API version")
	          .select()                                  
	          .apis(RequestHandlerSelectors.basePackage("com.example.demo"))              
	          .paths(PathSelectors.any())                          
	          .build()
	          .apiInfo(apiInfo()) ; 
	    
	    }
	    
	    
	    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");

	        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	    }
	    
	    private ApiInfo apiInfo() {
	        return new ApiInfo(
	          "My REST API", 
	          "Spring Boot description of API.", 
	          "API Spring Rest", 
	          "Terms of service", 
	          new Contact("Narendra Solanke", "www.example.com", "test@silicus.com"), 
	          "License of API", "API license URL", Collections.emptyList());
	   }
	   
	}


