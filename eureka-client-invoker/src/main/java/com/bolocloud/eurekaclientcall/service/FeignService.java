package com.bolocloud.eurekaclientcall.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-provider",fallback = FeignServiceImpl.class)
public interface FeignService {

    @GetMapping("/provider")
    String getHello();



}
