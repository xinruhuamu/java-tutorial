package com.xrhm.javatutorial.学习.进阶.JAVA三大器.监听器Listener;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author xinruhuamu
 * @version 版本号
 * @className WebListenerConfig
 * @description TODO
 * @date 2020/2/21 14:50
 */
@Configuration
public class WebListenerConfig implements WebMvcConfigurer {
    /**
     *@description TODO
     * 注册监听器
     *@date 2020/2/21 15:01
     *@param []
     *@return org.springframework.boot.web.servlet.ServletListenerRegistrationBean
     */
    @SuppressWarnings({"rawtypes","unchecked"})
    @Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean() {
        ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean();
        servletListenerRegistrationBean.setListener(new OnlineCountListener());
        return servletListenerRegistrationBean;
    }
}
