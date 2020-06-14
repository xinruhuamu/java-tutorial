package com.xrhm.javatutorial.学习.进阶.SPRING.SPRING事件机制;

import org.springframework.context.ApplicationEventPublisher;

public class Client {
    public static void main(String[] args) {
        UserService userService = new UserService();

        userService.register("xingruhuamu");
    }
}
