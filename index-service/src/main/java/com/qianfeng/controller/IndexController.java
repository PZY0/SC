package com.qianfeng.controller;

import com.qianfeng.entity.Product;
import com.qianfeng.feign.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author pangzhenyu
 * @Date 2019/11/30
 */
@RestController
@RequestMapping("index")
public class IndexController {

    /*private String PRODUCT_SERVICE_URL = "http://PRODUCT-SERVICE/product/list";

    @Autowired
    private RestTemplate restTemplate;*/

    @Autowired
    private IProductService productService;

    @RequestMapping("show")
    public List<Product> show(){
        //RestTemplate restTemplate = new RestTemplate();
        //return restTemplate.getForObject(PRODUCT_SERVICE_URL,List.class);
        return productService.list();
    }
}
