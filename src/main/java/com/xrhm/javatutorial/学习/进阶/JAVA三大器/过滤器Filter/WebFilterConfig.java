package com.xrhm.javatutorial.学习.进阶.JAVA三大器.过滤器Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xinruhuamu
 * @version 版本号
 * @className WebFilterConfig
 * @description TODO
 * @date 2020/2/21 22:34
 */
@Configuration
public class WebFilterConfig {

    /**
     * @param []
     * @return org.springframework.boot.web.servlet.FilterRegistrationBean
     * @description TODO
     * 注册并配置过滤器
     * @date 2020/2/21 22:37
     */
    @Bean
    public FilterRegistrationBean registerFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new DemoWebFilter());
        filterRegistrationBean.addUrlPatterns("/*");

        return filterRegistrationBean;
    }

}
