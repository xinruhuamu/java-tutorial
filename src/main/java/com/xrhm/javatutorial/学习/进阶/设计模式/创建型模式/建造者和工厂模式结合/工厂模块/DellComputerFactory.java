package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.工厂模块;

import com.dcqc.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.产品类.Computer;
import com.dcqc.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.产品类.DellLaptop;
import com.dcqc.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.建造模块.ComputerBuilder;
import com.dcqc.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.建造模块.ComputerDirector;
import com.dcqc.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.建造模块.DellComputerBuilder;

public class DellComputerFactory implements ComputerFactory {
    @Override
    public Computer getComputer() {
        ComputerBuilder computerBuilder = new DellComputerBuilder(new DellLaptop());
        ComputerDirector director = new ComputerDirector(computerBuilder);

        return director.build("锐龙R5-3550H", "微星B450M主板", "索尼2k显示器");
    }
}
