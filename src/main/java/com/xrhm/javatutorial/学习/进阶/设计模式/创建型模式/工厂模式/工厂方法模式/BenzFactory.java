package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.工厂模式.工厂方法模式;

public class BenzFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Benz();
    }
}
