package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.单例模式;

public class Demo {
    public static void main(String[] args) {
        Singleton2 singleton2 = Singleton2.getUniqueInstance();
        singleton2.sayHi();

        Singleton3 singleton3 = Singleton3.getUniqueInstance();
        singleton3.sayHi();
    }
}
