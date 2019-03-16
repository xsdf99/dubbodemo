package com.df.dubboconsumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.df.dubbointerface.interfaces.HelloInterface;
import org.springframework.stereotype.Component;

@Component
public class HelloTest {

    @Reference
    private HelloInterface helloInterface;

    public String say() {
        System.out.println(helloInterface.say());
        return helloInterface.say();
    }
}
