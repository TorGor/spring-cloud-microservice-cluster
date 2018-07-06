package com.bolocloud.eurekaclientcall.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplete {

    @Bean(name = "restTemplateCommon")
    @LoadBalanced
    public RestTemplate restTemplateCommon(RestTemplateBuilder builder) {
        return builder
                .setConnectTimeout(5000)
                .setReadTimeout(15000)
                .build();
    }

}
