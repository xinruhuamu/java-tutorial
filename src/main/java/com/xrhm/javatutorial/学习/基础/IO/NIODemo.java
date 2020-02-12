package com.xrhm.javatutorial.学习.基础.IO;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NIODemo {
    public static void main(String[] args) {
        NIODemo nioDemo = new NIODemo();
        nioDemo.doRead();
        nioDemo.doWrite();
    }

    public void doRead() {
        File file = new File("E:\\文件库\\百草园节选.txt"); //1.获取文件
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            FileChannel channel = fileInputStream.getChannel();

            int capacity = 1024;
            ByteBuffer byteBuffer = ByteBuffer.allocate(capacity);
            //System.out.println("限制为：" + byteBuffer.limit() + "容量为：" + byteBuffer.capacity() + "位置为：" + byteBuffer.position());
            byteBuffer.flip();
            int length = -1;//注意这个-1，Buffer类中private int mark = -1;
            while ((length = channel.read(byteBuffer)) != -1) {
                byteBuffer.clear();
                byte[] bytes = byteBuffer.array();

                System.out.write(bytes, 0, length);
                //System.out.println("限制为：" + byteBuffer.limit() + "容量为：" + byteBuffer.capacity() + "位置为：" + byteBuffer.position());
            }
            //channel.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void doWrite() {
        File file = new File("E:\\文件库\\写入测试文件.txt");
        FileOutputStream fileOutputStream = null;
        String str = "    我家的后面有一个很大的园，相传叫作百草园。现在是早已并屋子一起卖给朱文公的子孙了，连那最末次的相见也已经隔了七八年，其中似乎确凿只有一些野草；但那时却是我的乐\n" +
                "园。不必说碧绿的菜畦，光滑的石井栏，高大的皂荚树，紫红的桑椹；也不必说鸣蝉在树叶里长吟，肥胖的黄蜂伏在菜花上，轻捷的叫天子（云雀）忽然从草间直窜向云霄里去了。单是\n" +
                "周围的短短的泥墙根一带，就有无限趣味。油蛉在这里低唱，蟋蟀们在这里弹琴。翻开断砖来，有时会遇见蜈蚣；还有斑蝥，倘若用手指按住它的脊梁，便会拍的一声，从后窍喷出一阵\n" +
                "烟雾。何首乌藤和木莲藤缠络着，木莲有莲房一般的果实，何首乌有拥肿的根。有人说，何首乌根是有象人形的，吃了便可以成仙，我于是常常拔它起来，牵连不断地拔起来，也曾因此\n" +
                "弄坏了泥墙，却从来没有见过有一块根象人样。如果不怕刺，还可以摘到覆盆子，象小珊瑚珠攒成的小球，又酸又甜，色味都比桑椹要好得远。\n" +
                "    长的草里是不去的，因为相传这园里有一条很大的赤练蛇。\n" +
                "    长妈妈曾经讲给我一个故事听：先前，有一个读书人住在古庙里用功，晚间，在院子里纳凉的时候，突然听到有人在叫他。答应着，四面看时，却见一个美女的脸露在墙头上，向他\n" +
                "一笑，隐去了。他很高兴；但竟给那走来夜谈的老和尚识破了机关。说他脸上有些妖气，一定遇见“美女蛇”了；这是人首蛇身的怪物，能唤人名，倘一答应，夜间便要来吃这人的肉的。\n" +
                "他自然吓得要死，而那老和尚却道无妨，给他一个小盒子，说只要放在枕边，便可高枕而卧。他虽然照样办，却总是睡不着，——当然睡不着的。到半夜，果然来了，沙沙沙！门外象是风\n" +
                "雨声。他正抖作一团时，却听得豁的一声，一道金光从枕边飞出，外面便什么声音也没有了，那金光也就飞回来，敛在盒子里。后来呢？后来，老和尚说，这是飞蜈蚣，它能吸蛇的脑髓\n" +
                "，美女蛇就被它治死了。 \n" +
                "    结末的教训是：所以倘有陌生的声音叫你的名字，你万不可答应他。";
        try {
            fileOutputStream = new FileOutputStream(file, true);//1.输出流开启append mode，在写入文件时会在文件末尾写入而不会覆盖。
            FileChannel channel = fileOutputStream.getChannel();
            int capacity = 1024;
            ByteBuffer byteBuffer = ByteBuffer.allocate(capacity);

            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            int length = str.getBytes().length;
            int markPos = 0;

            //注意，如果写入数据的大小超过缓存区容量，报错java.nio.BufferOverflowException，需要对数据进行循环写入
            while (markPos < length) {
                if (length < 1024) {
                    byteBuffer.put(bytes);
                    byteBuffer.flip();//缓存区写入时需要使用
                    channel.write(byteBuffer);
                } else {
                    byteBuffer.put(Arrays.copyOfRange(bytes, markPos, markPos + 1023));//每次向缓存区写入1024字节大小数据
                    byteBuffer.flip();
                    channel.write(byteBuffer);
                    markPos += 1024;

                    byteBuffer.clear();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
