package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.工厂模式.抽象工厂模式;

/*
 *工厂接口
 * */
public interface Factory {
    Engine createEngine();

    Horn createHorn();
}
