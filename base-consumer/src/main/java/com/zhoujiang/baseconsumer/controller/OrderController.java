package com.zhoujiang.baseconsumer.controller;

import com.zhoujiang.baseconsumer.feign.MemberApiFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    //自动注入RestTemplate 类
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private MemberApiFeign memberApiFeign;
    @RequestMapping("/getOrder")
    public String getOrder(){
        //这里放的url，使用的是服务提供者的别名+方法名
        String result=restTemplate.getForObject("http://service-member:8081/getUserList",String.class);
        return result;
    }
    //方法二，通过feign
    @RequestMapping("/getFeignOrder")
    public String getFeignOrder(){
        System.out.println("1111111111111111111111111111");
        return memberApiFeign.getUserList();
    }
}

