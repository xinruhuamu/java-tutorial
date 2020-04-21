package com.xrhm.javatutorial.学习.进阶.SERVLET;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter
public class RequestWebFilter implements Filter {
    private static final Logger LOGGER = LoggerFactory.getLogger(RequestWebFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;

        LOGGER.info("当前Request 线程ID：", Thread.currentThread().getId());
        LOGGER.info("当前Request Session ID:", request.getSession().getId());
    }

    @Override
    public void destroy() {

    }
}
