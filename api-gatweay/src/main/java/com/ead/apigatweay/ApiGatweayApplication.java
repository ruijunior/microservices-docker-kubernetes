package com.ead.apigatweay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiGatweayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatweayApplication.class, args);
	}

}
