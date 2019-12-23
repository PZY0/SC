package com.qianfeng.testservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author pangzhenyu
 * @Date 2019/12/5
 */
@Controller
@RequestMapping("hello")
public class HelloController {

    @GetMapping("show")
    public String hello(){
        return "hello";
    }
}
