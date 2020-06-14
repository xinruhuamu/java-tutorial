package com.xrhm.javatutorial.学习.进阶.设计模式.结构型模式.装饰模式;

/*
 * 抽象装饰类Decorator，添加贴墙纸功能
 * */
public class DecoratorWall implements Wall {
    private Wall wall; //维持一个抽象组件的引用

    //注入Component
    public DecoratorWall(Wall wall) {
        this.wall = wall;
    }


    @Override
    public void hangTv() {
        wall.hangTv();//保留Wall原本功能
    }
}
