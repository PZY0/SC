package com.qianfeng.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author pangzhenyu
 * @Date 2019/12/3
 */
@Controller
@RequestMapping("config")
@RefreshScope
public class ConfigClientController {

    @Value("${server.images}")
    private String port;

    @GetMapping("client")
    @ResponseBody
    public String client(){
        return port;
    }
}
