package com.imagedt.cherry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication(scanBasePackages = "com.imagedt")
public class CherryCommonEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CherryCommonEurekaApplication.class, args);
    }

}
