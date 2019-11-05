package com.microservice.moduleservicefeign.service.feign;

import com.microservice.moduleservicefeign.service.feign.impl.HiServiceHystrixImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Fa
 * @date 2019-10-28 23:11
 */
@FeignClient(value = "service-hi", fallback = HiServiceHystrixImpl.class)
public interface HiServiceFeign {

    @GetMapping("/hi")
    String sayHi(@RequestParam(value = "name") String name);

}
