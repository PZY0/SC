package com.qianfeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author pangzhenyu
 * @Date 2019/11/30
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients //启用声明式REST调用服务
@EnableCircuitBreaker   //熔断器
@EnableHystrixDashboard //熔断器监控仪表盘
public class IndexServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(IndexServiceApplication.class,args);
    }
}
