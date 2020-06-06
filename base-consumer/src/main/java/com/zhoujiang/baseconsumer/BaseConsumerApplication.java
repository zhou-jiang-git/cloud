package com.zhoujiang.baseconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
public class BaseConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseConsumerApplication.class, args);
    }
    /**
     *@ Bean，是注入springboot
     * @ LoadBalanced，开启负载均衡，开启的时候，restTemplate.getForObject（）里面是serviceid(service-member)
     * @ LoadBalanced，不开启的时候，restTemplate.getForObject（）里面是ip地址（127.0.0.1）
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
