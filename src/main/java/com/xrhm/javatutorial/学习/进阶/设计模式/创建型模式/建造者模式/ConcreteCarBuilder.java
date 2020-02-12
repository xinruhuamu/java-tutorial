package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.建造者模式;

/*
 * 具体建造者，重新具体方法
 * */
public class ConcreteCarBuilder implements CarBuilder {
    private Car car = new Car();

    @Override
    public void buildEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void buildHorn(String horn) {
        car.setHorn(horn);
    }

    @Override
    public void buildTire(String tire) {
        car.setTire(tire);
    }

    @Override
    public Car getCar() {
        return new Car();
    }
}
