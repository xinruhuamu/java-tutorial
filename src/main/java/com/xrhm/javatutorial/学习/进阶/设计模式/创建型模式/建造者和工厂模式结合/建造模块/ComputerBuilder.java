package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.建造模块;

import com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.产品类.Computer;

/*
 * Computer抽象建造者
 * */
public interface ComputerBuilder {

    //组装CPU,然后返回Computer接口实现类
    void buildCpu(String cpu);

    //组装mainBoard
    void buildMainBoard(String mainBoard);

    //组装screen
    void buildScreen(String screen);

    //获取组装好的电脑
    Computer getComputer();

}
