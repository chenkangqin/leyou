package com.qin.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.leyou.api.UserApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Reference(version = "1.0.0")
    private UserApi userApi;
    @RequestMapping("/getUserInfo")
    public String getUserInfo(){
        return userApi.getUserName("fds");
    }
}
