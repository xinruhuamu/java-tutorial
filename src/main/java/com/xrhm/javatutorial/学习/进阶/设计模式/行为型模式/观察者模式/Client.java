package com.xrhm.javatutorial.学习.进阶.设计模式.行为型模式.观察者模式;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Observer;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        DataWebApi api = new DataWebApi();
        Observer observer = new PageHandler();
        api.addObserver(observer);
        api.getDataByPage(6);

        Class<DataWebApi> clazz = DataWebApi.class;
        Field[] fields = api.getClass().getDeclaredFields();


        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.getName());
            System.out.println(field.get(api));
        }


    }
}
