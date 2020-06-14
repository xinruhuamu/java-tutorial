package com.xrhm.javatutorial.学习.进阶.设计模式.结构型模式.装饰模式;

/*
 * 具体组件 ConcreteComponent
 * */
public class ConcreteWall implements Wall {
    private int width;
    private int high;

    @Override
    public void hangTv() {
        System.out.println("墙上可以挂电视~");
    }
}
