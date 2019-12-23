package com.qianfeng.controller;

import com.qianfeng.entity.Product;
import com.qianfeng.service.IProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author pangzhenyu
 * @Date 2019/11/30
 */
@RestController
@RequestMapping("product")
@Slf4j
public class ProductController {

    @Autowired
    private IProductService productService;

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("list")
    public List<Product> list(){
        log.info(serverPort);
        return productService.list();
    }
}
