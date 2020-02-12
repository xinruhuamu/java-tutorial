package com.xrhm.javatutorial.学习.基础.IO;

import java.io.*;

public class IODemo {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\文件库\\古诗文.txt"); //1.获取文件
        FileReader fileReader = new FileReader(file); //2.使用字符流
        BufferedReader bufferedReader = new BufferedReader(fileReader);//3.缓存读

        String content;
        while ((content = bufferedReader.readLine()) != null) {
            System.out.println(content);
        }
    }
}
