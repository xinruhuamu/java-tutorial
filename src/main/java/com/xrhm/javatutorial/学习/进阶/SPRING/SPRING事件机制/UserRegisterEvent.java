package com.xrhm.javatutorial.学习.进阶.SPRING.SPRING事件机制;

import org.springframework.context.ApplicationEvent;

/*
 * 用户注册事件
 * */

public class UserRegisterEvent extends ApplicationEvent {
    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param username the object on which the event initially occurred or with
     *                 which the event is associated (never {@code null})
     */
    public UserRegisterEvent(String username) {
        super(username);
    }
}
