package com.bolocloud.eurekaserverslave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerSlave2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerSlave2Application.class, args);
    }
}
