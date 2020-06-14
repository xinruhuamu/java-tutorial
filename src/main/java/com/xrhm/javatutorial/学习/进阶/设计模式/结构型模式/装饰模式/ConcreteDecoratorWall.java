package com.xrhm.javatutorial.学习.进阶.设计模式.结构型模式.装饰模式;

public class ConcreteDecoratorWall extends DecoratorWall {
    public ConcreteDecoratorWall(Wall wall) {
        super(wall);
    }

    public void stickPaper() {
        System.out.println("在墙上贴纸~");
    }
}
