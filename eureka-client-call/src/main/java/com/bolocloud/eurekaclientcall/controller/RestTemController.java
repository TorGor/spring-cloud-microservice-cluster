package com.bolocloud.eurekaclientcall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class RestTemController {

//    @LoadBalanced
    @Resource(name = "restTemplateCommon")
    RestTemplate template;

    @GetMapping(value = "call")
    public String call(){
        String msg = template.getForObject("http://eureka-provider/provider",String.class);
        return msg;
    }
}
