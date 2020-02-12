package com.xrhm.javatutorial.学习.基础.Java三大特性;

public class Cat implements Animal {
    @Override
    public String eat() {
        return "fish";
    }

    @Override
    public String say() {
        return "喵喵喵~";
    }
}
