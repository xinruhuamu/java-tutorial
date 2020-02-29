package com.xrhm.javatutorial.学习.进阶.JAVA三大器.拦截器Interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author xinruhuamu
 * @version 版本号
 * @className DemoInterceptor
 * @description TODO
 * 通过实现HandlerInterceptor接口或者继承HandlerInterceptorAdapter类完成自定义.
 * @date 2020/2/21 23:03
 */

public class DemoInterceptor implements HandlerInterceptor {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        LOGGER.info("拦截前prehandle");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        LOGGER.info("这是posthandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
