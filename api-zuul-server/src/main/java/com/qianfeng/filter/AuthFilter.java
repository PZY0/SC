package com.qianfeng.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author pangzhenyu
 * @Date 2019/12/3
 */
@Component
@Slf4j
public class AuthFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        log.info("-----AuthFilter-----");
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getParameter("token");
        if(token == null || "".equals(token.trim())){
            //让请求不在往下分发
            context.setSendZuulResponse(false);
            try {
                context.getResponse().getWriter().print("验证失败");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
