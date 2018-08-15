package com.filter;

import javax.servlet.*;
import java.io.IOException;

public class AFilter implements Filter {
    public void destroy() {
        System.out.println("Filter 要死了");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("Filter 执行了");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("Filter 初始化");
    }

}
