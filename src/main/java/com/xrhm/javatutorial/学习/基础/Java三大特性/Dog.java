package com.xrhm.javatutorial.学习.基础.Java三大特性;

public class Dog implements Animal {
    @Override
    public String eat() {
        return "bone";
    }

    @Override
    public String say() {
        return "汪汪汪~";
    }
}
