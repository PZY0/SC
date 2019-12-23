package com.qianfeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author pangzhenyu
 * @Date 2019/12/3
 */
@SpringBootApplication
@EnableEurekaClient
public class ApiGatewayApplication {
    public static void main(String[] args){
        SpringApplication.run(ApiGatewayApplication.class,args);
    }
}
