package com.bolocloud.eurekaclientzipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class EurekaClientZipkinServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientZipkinServerApplication.class, args);
    }
}
