package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Hello world!
 *
 */
public class SpringBootStandAloneWarApp extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder apringApplicationBuilder) {
		return apringApplicationBuilder.sources(SpringBootStandAloneWarApp.class);
	}
	
	
    public static void main( String[] args )
    {
        SpringApplication.run(SpringBootStandAloneWarApp.class, args);
    }
}
