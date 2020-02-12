package com.xrhm.javatutorial.学习.进阶.多线程JUC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName DemoThreadLocal
 * @Description TODO
 * @Author duochiqingcai
 * @Date 2020/1/5 0:38
 * @Version
 */
public class DemoThreadLocal {
    public static void main(String[] args) {
        ThreadLocal<Map<?, ?>> mapThreadLocal = new ThreadLocal<>();

        Map<String, String> map = new HashMap<>(16);
        map.put("key1", "value1");
        map.put("key1", "value2");
        mapThreadLocal.set(map);

        ThreadLocal<List<String>> listThreadLocal = new ThreadLocal<>();
        List<String> stringList = new ArrayList<>();
        stringList.add("value1");
        stringList.add("value2");
        listThreadLocal.set(stringList);

        System.out.println(mapThreadLocal.get());
        System.out.println(listThreadLocal.get());

    }
}
