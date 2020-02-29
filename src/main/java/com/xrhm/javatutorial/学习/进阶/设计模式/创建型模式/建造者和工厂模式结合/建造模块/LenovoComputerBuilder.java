package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.建造模块;

import com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.产品类.Computer;
import com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.产品类.LenovoComputer;

public class LenovoComputerBuilder implements ComputerBuilder {
    //使用构造方法传入LenovoComputer抽象类的实现类
    private LenovoComputer lenovoComputer;

    public LenovoComputerBuilder(LenovoComputer lenovoComputer) {
        this.lenovoComputer = lenovoComputer;
    }


    @Override
    public void buildCpu(String cpu) {
        lenovoComputer.setCpu(cpu);
    }

    @Override
    public void buildMainBoard(String mainBoard) {
        lenovoComputer.setMainBoard(mainBoard);

    }

    @Override
    public void buildScreen(String screen) {
        lenovoComputer.setScreen(screen);

    }

    @Override
    public Computer getComputer() {
        return lenovoComputer;
    }
}
