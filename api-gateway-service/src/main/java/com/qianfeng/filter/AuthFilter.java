package com.qianfeng.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Author pangzhenyu
 * @Date 2019/12/3
 */
@Component
@Slf4j
public class AuthFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("-------AuthFilter-------");

        //ServerWebExchange相当于请求响应的上下文，通过它可以取到request和response
        String token = exchange.getRequest().getQueryParams().getFirst("token");
        if(token == null || "".equals(token.trim())){
            log.info("认证失败");
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        //指定过滤器的优先级大小，值越小，优先级越高
        return 0;
    }
}
