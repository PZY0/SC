package com.qianfeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @Author pangzhenyu
 * @Date 2019/12/2
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class HystrixTurbineApplication {
    public static void main(String[] args){
        SpringApplication.run(HystrixTurbineApplication.class,args);
    }
}
