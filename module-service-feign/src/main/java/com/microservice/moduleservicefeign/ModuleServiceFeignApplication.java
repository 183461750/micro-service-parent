package com.microservice.moduleservicefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ModuleServiceFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuleServiceFeignApplication.class, args);
	}

}
