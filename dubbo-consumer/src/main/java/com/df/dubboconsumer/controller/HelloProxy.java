package com.df.dubboconsumer.controller;

import com.df.dubboconsumer.service.HelloTest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloProxy {

    @Resource
    private HelloTest helloTest;

    @Value("${server.port}")
    private String port;

    @GetMapping("/test")
    public String test() {
        return port + helloTest.say();
    }
}
