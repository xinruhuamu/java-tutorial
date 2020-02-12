package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.建造者模式;

/*
 * 指挥者，指导建造什么样的汽车
 * */
public class CarDirector {
    //成员变量，指定建造接口
    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car construct(String engine, String horn, String tire) {
        this.carBuilder.buildEngine(engine);
        this.carBuilder.buildHorn(horn);
        this.carBuilder.buildTire(tire);

        return this.carBuilder.getCar();
    }

}
