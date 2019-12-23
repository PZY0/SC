package com.qianfeng.feign;

import com.qianfeng.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author pangzhenyu
 * @Date 2019/12/1
 */
@FeignClient(name = "PRODUCT-SERVICE",
        fallback = IProductService.IProductServiceFallback.class)
public interface IProductService {

    //通过GetMapping进行匹配
    @GetMapping("product/list")
    public List<Product> list();

    @Component
    @Slf4j
    static class IProductServiceFallback implements IProductService{
        //默认时间1秒，如果没有服务端进行处理，则进入熔断处理逻辑
        @Override
        public List<Product> list() {
            log.info("进入熔断处理逻辑");
            List<Product> list = new ArrayList<>();
            return list;
        }
    }
}
