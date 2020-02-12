package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.工厂模式.工厂方法模式;

public class Audi implements Car {
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
        return "Audi喇叭，滴，滴，滴~";
    }
}
