package com.saran.SBwardeployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SbWarDeploymentApplication extends SpringBootServletInitializer {
   	
	public static void main(String[] args) {
		SpringApplication.run(SbWarDeploymentApplication.class, args);
	}

}
