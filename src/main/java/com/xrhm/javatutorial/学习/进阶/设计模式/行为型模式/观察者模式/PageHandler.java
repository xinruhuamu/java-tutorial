package com.xrhm.javatutorial.学习.进阶.设计模式.行为型模式.观察者模式;

import org.springframework.scheduling.annotation.Async;

import java.util.Observable;
import java.util.Observer;

public class PageHandler implements Observer {
    @Async
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
        System.out.println("观察到分页请求");
    }
}
