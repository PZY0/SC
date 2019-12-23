package com.qianfeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author pangzhenyu
 * @Date 2019/11/30
 */
@SpringBootApplication
@EnableEurekaServer
public class UserServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(UserServiceApplication.class,args);
    }
}
