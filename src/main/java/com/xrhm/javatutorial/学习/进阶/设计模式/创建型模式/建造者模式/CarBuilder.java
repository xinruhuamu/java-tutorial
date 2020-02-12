package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.建造者模式;

/*
 *抽象的建造者，即汽车的组装步骤
 * 不关心体组装什么样的部件，这是具体建造者关心的
 *
 * */
public interface CarBuilder {
    //组装引擎
    void buildEngine(String engine);

    //组装喇叭
    void buildHorn(String horn);

    //组装轮胎
    void buildTire(String tire);

    //获取组装好的汽车
    Car getCar();
}
