package com.dream.dataservice.springboot_dataservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("com.dream.dataservice.springboot_dataservice.dao")
@EnableEurekaClient
@SpringBootApplication
public class SpringbootDataserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDataserviceApplication.class, args);
	}
}
