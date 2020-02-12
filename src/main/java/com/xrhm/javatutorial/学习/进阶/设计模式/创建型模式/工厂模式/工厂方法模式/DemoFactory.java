package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.工厂模式.工厂方法模式;

public class DemoFactory {
    public static void main(String[] args) {
        //Audi
        CarFactory factory = new AudiFactory();
        Audi audi = (Audi) factory.getCar();
        System.out.println(audi.doHonk());

        //Benz
        CarFactory factory1 = new BenzFactory();
        Car benz = factory1.getCar();
        System.out.println(benz);
/*        Benz benz = (Benz) factory1.getCar();
        System.out.println(benz.doHonk());*/


    }
}
