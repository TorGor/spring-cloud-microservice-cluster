package com.bolocloud.eurekaclientcall.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-provider")
public interface FeignService {

    @GetMapping("/provider")
    String getHello();

}
