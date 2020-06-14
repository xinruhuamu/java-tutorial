package com.xrhm.javatutorial.学习.进阶.设计模式.结构型模式.装饰模式;

public class Demo {
    public static void main(String[] args) {
        Wall wall = new ConcreteWall();

        ConcreteDecoratorWall decoratorWall = new ConcreteDecoratorWall(wall);

        decoratorWall.hangTv();//调用原有挂电视方法
        decoratorWall.stickPaper();//调用新贴纸方法
    }
}
