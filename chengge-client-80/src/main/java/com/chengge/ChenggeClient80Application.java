package com.chengge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ChenggeClient80Application {
    public static void main(String[] args) {
        SpringApplication.run(ChenggeClient80Application.class, args);
    }
}
