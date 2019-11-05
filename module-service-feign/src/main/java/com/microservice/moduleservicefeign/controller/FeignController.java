package com.microservice.moduleservicefeign.controller;

import com.microservice.moduleservicefeign.service.feign.HiServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fa
 * @date 2019-11-04 22:46
 */
@RestController
@RequestMapping(value = "/feign")
public class FeignController {

    @Autowired
    private HiServiceFeign hiServiceFeign;

    @GetMapping(value = "/hi")
    public String sayHi(String name) {
        return "feign: "+hiServiceFeign.sayHi(name);
    }

}
