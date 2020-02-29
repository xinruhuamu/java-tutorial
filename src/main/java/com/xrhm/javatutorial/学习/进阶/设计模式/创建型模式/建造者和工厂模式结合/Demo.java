package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合;

import com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.产品类.LenovoLaptop;
import com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.工厂模块.ComputerFactory;
import com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.工厂模块.LenovoComputerFactory;

public class Demo {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new LenovoComputerFactory();
        LenovoLaptop lenovoLaptop = (LenovoLaptop) computerFactory.getComputer();

        lenovoLaptop.replaceBattery("劲量电池");
    }
}
