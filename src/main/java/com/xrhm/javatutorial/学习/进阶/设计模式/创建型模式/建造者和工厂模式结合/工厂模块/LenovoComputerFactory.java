package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.工厂模块;

import com.dcqc.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.产品类.Computer;
import com.dcqc.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.产品类.LenovoLaptop;
import com.dcqc.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.建造模块.ComputerDirector;
import com.dcqc.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.建造模块.LenovoComputerBuilder;

public class LenovoComputerFactory implements ComputerFactory {

    @Override
    public Computer getComputer() {
        ComputerDirector director = new ComputerDirector(new LenovoComputerBuilder(new LenovoLaptop()));

        return director.build("Intel i7-7700", "华硕B470主板", "三星2k显示器");
    }
}
