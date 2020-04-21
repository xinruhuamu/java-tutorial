package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.单例模式;

/*
 * 双重检验加锁，使用volatile和synchronized关键字，保证线程安全
 *
 * */
public class Singleton2 {
    //volatile 在此是禁止指令重排的作用, 保证先初始化, 再把对象引用赋值给instance变量
    private volatile static Singleton2 uniqueInstance = null;

    private Singleton2() {

    }

    public static Singleton2 getUniqueInstance() {
        if (uniqueInstance == null) {
            //锁住当前类，防止在非空判断过程中有其他线程创建实例的情况
            synchronized (Singleton2.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton2();
                }
            }
        }
        return uniqueInstance;
    }

    public void sayHi() {
        System.out.println("Hi,这是双重检验加锁单例模式，线程安全~");
    }
}
