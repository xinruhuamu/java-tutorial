package com.xrhm.javatutorial.学习.进阶.JAVA三大器.过滤器Filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Objects;

/**
 * @author xinruhuamu
 * @version 版本号
 * @className DemoWebFilter
 * 过滤器demo：获取请求
 * @description TODO
 * @date 2020/2/21 22:04
 */
@WebFilter
public class DemoWebFilter implements Filter {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoWebFilter.class);
    @Autowired
    private HttpServletRequest request;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        LOGGER.info("DemoWebFilter创建初始化成功");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String body = request.getRequestURI();
        // do something doFilter()之前可以对request进行操作
        //如需对response进行操作，可在此先创建HttpServletResponseWrapper的实现类对象

        //执行过滤器链，进行Servlet容器初始化，Servlet的doService()是在chain.doFilter()方法中执行的；对response操作，doFilter 的response参数需要是HttpServletResponseWrapper的实现类对象。
        filterChain.doFilter(servletRequest, servletResponse);

        //do something 如果要对response进行操作可以在这里进行；doFilter 的response参数需要是HttpServletResponseWrapper的实现类对象，详情可百度

        //注意：在实际运行的时候，会打印多个语句，因为⭐浏览器请求除了localhost可能还会有其他js、css、图片等静态文件；可以使用postman等接口测试工具测试
        LOGGER.info(body);
    }

    @Override
    public void destroy() {
        LOGGER.info("DemoWebFilter销毁");
    }
}
