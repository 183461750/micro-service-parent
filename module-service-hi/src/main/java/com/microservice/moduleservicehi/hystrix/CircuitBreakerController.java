package com.microservice.moduleservicehi.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fa
 * @date 2019-10-24 19:22
 */
@RestController
public class CircuitBreakerController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(@RequestParam(value = "name", defaultValue = "fujian") String name) {
        return "hi, " + name + ", i am from port:" + port;
    }

    public String hiError(String name) {
        return "hi, " + name + ", error happens";
    }

}
