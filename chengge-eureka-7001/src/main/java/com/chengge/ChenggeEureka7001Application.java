package com.chengge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //Eureka服务端的注解
public class ChenggeEureka7001Application {
    public static void main(String[] args) {
        SpringApplication.run(ChenggeEureka7001Application.class, args);
    }
}
