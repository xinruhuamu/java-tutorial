package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.单例模式;

/*
 * 静态内部类模式,线程安全
 * */
public class Singleton3 {
    private Singleton3() {

    }

    public static Singleton3 getUniqueInstance() {
        return InnerSingleton.instance;
    }

    private static class InnerSingleton {
        private static final Singleton3 instance = new Singleton3();
    }

    public void sayHi() {
        System.out.println("Hi,这是静态内部类单例模式，线程安全~");
    }
}
