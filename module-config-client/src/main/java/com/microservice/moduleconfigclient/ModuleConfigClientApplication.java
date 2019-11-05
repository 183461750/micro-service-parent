package com.microservice.moduleconfigclient;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableDiscoveryClient
@RefreshScope
public class ModuleConfigClientApplication {

    @Value("${foo}")
    private String foo;

    public static void main(String[] args) {
        SpringApplication.run(ModuleConfigClientApplication.class, args);
    }

    @GetMapping(value = "/hi")
    public String readConfigValue() {
        return foo;
    }

}
