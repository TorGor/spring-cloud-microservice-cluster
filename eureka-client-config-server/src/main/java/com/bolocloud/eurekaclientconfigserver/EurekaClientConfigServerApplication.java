package com.bolocloud.eurekaclientconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EurekaClientConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientConfigServerApplication.class, args);
    }
}
