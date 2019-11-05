package com.microservice.moduleservicefeign.service.feign.impl;

import com.microservice.moduleservicefeign.service.feign.HiServiceFeign;
import org.springframework.stereotype.Component;

/**
 * @author Fa
 * @date 2019-11-04 17:45
 */
@Component
public class HiServiceHystrixImpl implements HiServiceFeign {

    @Override
    public String sayHi(String name) {
        return "sorry, " + name + ", it has a error";
    }
}
