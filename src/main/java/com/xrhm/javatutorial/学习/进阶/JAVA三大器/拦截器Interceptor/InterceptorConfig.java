package com.xrhm.javatutorial.学习.进阶.JAVA三大器.拦截器Interceptor;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author xinruhuamu
 * @version 版本号
 * @className InterceptorConfig
 * @description TODO
 * @date 2020/2/21 23:01
 */
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new DemoInterceptor());
    }
}
