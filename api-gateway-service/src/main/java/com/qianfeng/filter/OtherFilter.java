package com.qianfeng.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Author pangzhenyu
 * @Date 2019/12/3
 */
@Component
@Slf4j
public class OtherFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("-------OtherFilter-------");

        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        //指定过滤器的优先级大小，值越小，优先级越高
        return 1;
    }
}
