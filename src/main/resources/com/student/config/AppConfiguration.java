package com.student.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {"com.*"})
public class AppConfiguration {
	
	
	InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
	viewResolver.setPrefix("/webapp/WEB-INF");
	viewResolver.setSuffix(".jsp");

}
