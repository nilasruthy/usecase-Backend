package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.example.service1", "com.example.model"})
public class UseCaseApplication extends SpringBootServletInitializer{

//	 @Override
//	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//	        return application.sources(UseCaseApplication.class);
//	    }

	public static void main(String[] args) {
		SpringApplication.run(UseCaseApplication.class, args);
	}

}


   