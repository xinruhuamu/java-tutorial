package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.产品类;

/*
 * 电脑接口,后面所有品牌电脑实现该接口
 * */
public interface Computer {
    //打游戏行为
    String playGames();

    //听音乐行为
    String playMusic();

    //办公Office行为
    String doOffice();
}
