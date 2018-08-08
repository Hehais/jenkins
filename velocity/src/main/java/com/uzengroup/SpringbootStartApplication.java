package com.uzengroup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringbootStartApplication extends SpringBootServletInitializer{
	 @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		 //设置启动类，用于独立运行tomcat运行的入口
        return application.sources(SpringbootStartApplication.class);
    }
	 
	 
	 
	public static void main(String[] args) {
		SpringApplication.run(SpringbootStartApplication.class, args);
	}
}
