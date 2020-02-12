package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.单例模式;

/*
 * synchronized关键字线程安全版本单例模式
 * */
public class Singleton1 {
    private static Singleton1 uniqueInstance = null;

    private Singleton1() {
    }


    public static synchronized Singleton1 getUniqueInstance() {
        //判断单例是否存在，若存在则返回当前单例，不存在就创建单例对象
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton1();
        }
        return uniqueInstance;
    }

    public void sayHi() {
        System.out.println("Hi,这是synchronized关键字单例模式，线程安全~");
    }
}
