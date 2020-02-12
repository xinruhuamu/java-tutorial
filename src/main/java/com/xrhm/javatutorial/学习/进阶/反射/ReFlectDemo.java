package com.xrhm.javatutorial.学习.进阶.反射;

import com.xrhm.javatutorial.学习.基础.Java三大特性.Cat;
import com.xrhm.javatutorial.学习.基础.Java三大特性.GarfieldCat;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReFlectDemo {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        //反射获取GarfieldCat类的Class类对象，并获取实例化对象
        Class clazz = GarfieldCat.class;
        GarfieldCat garfieldCat = (GarfieldCat) clazz.newInstance();

        //1.获取所有类成员（包括类常量）
        Field[] fields = clazz.getDeclaredFields();
        //Field field =clazz.getDeclaredField("VOICE");可以获取私有静态常量
        System.out.println(Arrays.toString(fields));
        //遍历所有类成员
        for (Field field : fields) {
            //取消访问权限，将对象的私有属性和方法设置为允许访问
            field.setAccessible(true);
            if (field.toString().contains("final")) {//判断是否存在final关键字的常量
                System.out.println(field.getName());//获取常量名称
            } else {
                field.set(garfieldCat, "newVal");//将实例化对象中的私有类成员变量值替换为新值
            }
        }

        //2.获取私有成员方法
        Method method = clazz.getDeclaredMethod("catchMouse", String.class);
        //解除私有权限
        method.setAccessible(true);
        //执行私有方法，第一个参数为实例化对象，后面参数为方法参数
        System.out.println(method.invoke(garfieldCat, "jerry"));


        //3.获取构造方法
        Constructor constructor = clazz.getConstructor();
        GarfieldCat cat = (GarfieldCat) constructor.newInstance();
        System.out.println(cat.eat());
    }
}
