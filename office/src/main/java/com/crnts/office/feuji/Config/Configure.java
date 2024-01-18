package com.crnts.office.feuji.Config;

import java.util.List;
import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = { "com.crnts.office.feuji", "com.crnts.office.feuji.repository", "com.crnts.office.feuji.service" })
@EnableWebMvc
public class Configure implements WebMvcConfigurer {

	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		System.out.println("checking");
		resolver.setSuffix(".jsp");
		return resolver;
	}

//	@Override
//	public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
//		SimpleMappingExceptionResolver exceptionResolver = new SimpleMappingExceptionResolver();
//		exceptionResolver.setDefaultErrorView("error");// Global
//
//		Properties properties = new Properties();
//		properties.put("java.lang.Exception", "errorBook"); // Specific
//		// properties.put("com.book.app.config.exception.BookException", "errorBook");
//		exceptionResolver.setExceptionMappings(properties);
//
//		resolvers.add(exceptionResolver);
//		WebMvcConfigurer.super.configureHandlerExceptionResolvers(resolvers);
//	}
//
//	@Bean
//	public CommonsMultipartResolver multipartResolver() {
//		return new CommonsMultipartResolver();
//	}

	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

}
