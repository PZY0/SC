package com.qianfeng.service.impl;

import com.qianfeng.entity.Product;
import com.qianfeng.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author pangzhenyu
 * @Date 2019/11/30
 */
@Service
public class ProductServiceImpl implements IProductService {
    @Override
    public List<Product> list() {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1,"华为"));
        list.add(new Product(2,"小米"));
        return list;
    }
}
