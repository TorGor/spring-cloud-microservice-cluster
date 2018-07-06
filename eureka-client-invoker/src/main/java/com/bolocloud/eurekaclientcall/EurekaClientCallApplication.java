package com.bolocloud.eurekaclientcall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EurekaClientCallApplication {



    public static void main(String[] args) {
        SpringApplication.run(EurekaClientCallApplication.class, args);
    }
}
