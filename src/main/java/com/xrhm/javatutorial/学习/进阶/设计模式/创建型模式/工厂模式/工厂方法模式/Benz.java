package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.工厂模式.工厂方法模式;

public class Benz implements Car {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String doHonk() {
        //do something...
        return "Benz喇叭，呜，呜，呜~";
    }
}
