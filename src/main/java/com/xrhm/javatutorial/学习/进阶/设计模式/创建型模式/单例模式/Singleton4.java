package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.单例模式;

/*
 * 枚举类enum方式，最佳单例方法
 * 枚举单例模式能够在序列化和反射中保证实例的唯一性。
 * */
public enum Singleton4 {
    //定义一个枚举元素，就是唯一实例
    UNIQUEINSTANCE;

    public void sayHi() {
        System.out.println("Hi，这是枚举类方法单例模式，线程安全~");
    }

}
