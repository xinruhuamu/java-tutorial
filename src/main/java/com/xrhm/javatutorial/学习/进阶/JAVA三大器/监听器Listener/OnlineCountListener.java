package com.xrhm.javatutorial.学习.进阶.JAVA三大器.监听器Listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.Set;

/**
 * @author xinruhuamu
 * @version 版本号
 * @className OnlineCountListener
 * @description TODO
 * @date 2020/2/21 14:54
 */
public class OnlineCountListener implements HttpSessionListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(OnlineCountListener.class);
    private int count;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        LOGGER.info("在线人数监听器，监听session会话创建~");
        count++;
        se.getSession().getServletContext().setAttribute("count",count);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        LOGGER.info("在线人数监听器，监听session会话删除~");
        count--;
        se.getSession().getServletContext().setAttribute("count",count);
    }
}
