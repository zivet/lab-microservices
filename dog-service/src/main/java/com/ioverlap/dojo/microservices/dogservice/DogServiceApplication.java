package com.ioverlap.dojo.microservices.dogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogServiceApplication.class, args);
	}

}
