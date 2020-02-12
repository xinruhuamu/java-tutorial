package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.产品类;

/*
 * Dell笔记本类
 * */
public class DellLaptop extends DellComputer {
    //笔记本电脑带电池，台式机不带
    private String battery;
    //是否便携？true
    private static final boolean ISPORTABLE = true;

    //Dell笔记本行为，更换Dell电池(这一块可以通过实现接口来实现，但是这里是介绍设计模式，所有自己实现了)
    public void replaceBattery(String battery) {
        //doSomething...更换Dell电池
        System.out.println("DellLaptop更换" + battery);
    }
}
