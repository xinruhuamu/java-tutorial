package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.工厂模式.抽象工厂模式;

public class Demo {
    public static void main(String[] args) {
        Factory audiFactory = new AudiFactory();
        System.out.println(audiFactory.createEngine().doRun());
        System.out.println(audiFactory.createHorn().doHonk());
    }
}
