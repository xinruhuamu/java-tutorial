package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.建造者模式;

public class DemoBuilder {
    public static void main(String[] args) {
        //指定具体建造者
        CarBuilder carBuilder = new ConcreteCarBuilder();
        //指挥者负责需求
        CarDirector carDirector = new CarDirector(carBuilder);
        Car audiCar = carDirector.construct("Audi引擎", "Audi喇叭", "Audi轮胎");

        System.out.println("这是Audi车" + audiCar.doRun());

    }
}
