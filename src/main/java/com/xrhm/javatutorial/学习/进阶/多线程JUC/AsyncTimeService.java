package com.xrhm.javatutorial.学习.进阶.多线程JUC;
/*
 * 一个计数类
 * */

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 基于spring线程池要进行异步执行的业务代码类
 * */
@Service
public class AsyncTimeService {
    private final ReentrantLock reentrantLock = new ReentrantLock();
    private final SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

    public AsyncTimeService() {
    }


    @Async("AsyncExecutor-1") //使用s指定spring线程池
    public synchronized void doCount() {
        try {
//            Thread.sleep(1000);
            TimeUnit.MILLISECONDS.sleep(2000);
        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName().concat(" ") + "当前时间为：" + format.format(new Date().getTime()));


    }

    public synchronized void doCountOfJdkPool() {
        try {
//            Thread.sleep(1000);
            TimeUnit.MILLISECONDS.sleep(2000);
        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName().concat(" ") + "当前时间为：" + format.format(new Date().getTime()));
    }

    /*
     * ReentrantLock加锁
     * */
    @Async("AsyncExecutor-1") //使用s指定spring线程池
    public void doCountOfLock() {
        reentrantLock.lock();
        try {
            TimeUnit.MILLISECONDS.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
        System.out.println(Thread.currentThread().getName().concat(" ") + "当前时间为：" + format.format(new Date().getTime()));
    }
}
