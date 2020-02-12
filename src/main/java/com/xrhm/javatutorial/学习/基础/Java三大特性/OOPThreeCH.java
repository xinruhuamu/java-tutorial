package com.xrhm.javatutorial.学习.基础.Java三大特性;

import sun.java2d.pipe.SpanIterator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class OOPThreeCH {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Animal garfield = new GarfieldCat();
        garfield.eat();
        //反射
        GarfieldCat cat = (GarfieldCat)Cat.class.newInstance();

        //通过反射获取子类对象方法，并执行。
        Method method = garfield.getClass().getMethod("eats", String.class);
        System.out.println(method.invoke(garfield, "意大利面"));
    }
}
