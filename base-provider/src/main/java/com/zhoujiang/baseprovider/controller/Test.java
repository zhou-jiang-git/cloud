package com.zhoujiang.baseprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Test {
        @RequestMapping("/getUserList")
        public List<String> getUserList() {
            List<String> listUser = new ArrayList<String>();
            listUser.add("zhangsan");
            listUser.add("lisi");
            listUser.add("yushengjun");
            return listUser;
    }
    @RequestMapping("/getFeignOrder")
    public List<String> getFeignOrder() {
        System.out.println("2022222222222222222");
        List<String> listUser = new ArrayList<String>();
        listUser.add("zhangsan");
        listUser.add("lisi");
        listUser.add("yushengjun");
        return listUser;
    }
}
