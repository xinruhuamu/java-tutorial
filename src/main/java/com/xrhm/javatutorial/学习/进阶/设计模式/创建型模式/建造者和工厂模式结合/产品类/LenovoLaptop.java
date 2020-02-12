package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.产品类;

/*
 * Lenovo笔记本类
 * */
public class LenovoLaptop extends LenovoComputer {
    //笔记本电脑带电池，台式机不带
    private String battery;
    //是否便携？true
    private static final boolean ISPORTABLE = true;

    //lenovo笔记本行为,更换lenovo电池
    public void replaceBattery(String battery) {
        //doSomething...更换Lenovo电池
        System.out.println("LenovoLaptop更换" + battery);
    }

}
