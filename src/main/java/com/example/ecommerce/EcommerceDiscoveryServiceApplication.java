package com.example.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EcommerceDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceDiscoveryServiceApplication.class, args);
    }

}
