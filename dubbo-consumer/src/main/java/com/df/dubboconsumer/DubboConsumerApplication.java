package com.df.dubboconsumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.df.dubboconsumer.service.HelloTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableDubbo
public class DubboConsumerApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DubboConsumerApplication.class, args);
//        HelloTest helloTest = (HelloTest) context.getBean("helloTest");
//        for (int i=0;i<10;i++){
//            helloTest.say();
//        }
    }

}
