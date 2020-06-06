package com.zhoujiang.baseregister;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
public class BaseRegisterApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseRegisterApplication.class, args);
    }
}
