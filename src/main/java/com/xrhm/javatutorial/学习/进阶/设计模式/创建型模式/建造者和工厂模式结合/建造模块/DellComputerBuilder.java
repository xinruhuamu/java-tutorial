package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.建造模块;

import com.dcqc.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.产品类.Computer;
import com.dcqc.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.产品类.DellComputer;

/*
 * 具体建造类，负责组装电脑
 * */
public class DellComputerBuilder implements ComputerBuilder {
    //使用构造方法传入DellComputer抽象类的实现类
    private DellComputer dellComputer;

    public DellComputerBuilder(DellComputer dellComputer) {
        this.dellComputer = dellComputer;
    }

    @Override
    public void buildCpu(String cpu) {
        dellComputer.setCpu(cpu);

    }

    @Override
    public void buildMainBoard(String mainBoard) {

        dellComputer.setMainBoard(mainBoard);

    }

    @Override
    public void buildScreen(String screen) {
        dellComputer.setScreen(screen);

    }

    @Override
    public Computer getComputer() {
        return dellComputer;
    }
}
