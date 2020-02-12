package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.工厂模式.抽象工厂模式;

public class AudiFactory implements Factory {
    @Override
    public Engine createEngine() {
        return new AudiEngine();
    }

    @Override
    public Horn createHorn() {
        return new AudiHorn();
    }
}
