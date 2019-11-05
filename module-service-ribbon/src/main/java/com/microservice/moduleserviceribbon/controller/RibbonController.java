package com.microservice.moduleserviceribbon.controller;

import com.microservice.moduleserviceribbon.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fa
 * @date 2019-11-04 22:39
 */
@RestController
@RequestMapping(value = "/ribbon")
public class RibbonController {

    @Autowired
    private HiService hiService;

    @GetMapping(value = "/hi")
    public String sayHi(String name) {
        return "ribbon: " + hiService.sayHi(name);
    }

}
