package com.bolocloud.eurekaclientzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class EurekaClientZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientZuulApplication.class, args);
    }
}
