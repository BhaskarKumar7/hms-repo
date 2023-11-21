package com.boot.hms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {
	
	private static final String RESOURCE_LOCATION="/resources/";
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry
		.addResourceHandler("/superadmin/resources/**")
		.addResourceLocations(RESOURCE_LOCATION);
		registry
		.addResourceHandler("/admin/resources/**")
		.addResourceLocations(RESOURCE_LOCATION);
		registry
		.addResourceHandler("/staff/resources/**")
		.addResourceLocations(RESOURCE_LOCATION);
	}	
}
