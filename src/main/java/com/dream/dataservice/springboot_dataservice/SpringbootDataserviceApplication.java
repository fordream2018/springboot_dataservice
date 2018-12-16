package com.dream.dataservice.springboot_dataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringbootDataserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDataserviceApplication.class, args);
	}
}
