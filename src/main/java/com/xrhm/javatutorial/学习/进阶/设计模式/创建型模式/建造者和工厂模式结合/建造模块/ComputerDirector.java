package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.建造模块;

import com.dcqc.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.产品类.Computer;

public class ComputerDirector {
    private ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer build(String cpu, String mainBoard, String screen) {
        computerBuilder.buildCpu(cpu);
        computerBuilder.buildMainBoard(mainBoard);
        computerBuilder.buildScreen(screen);

        return this.computerBuilder.getComputer();
    }
}
