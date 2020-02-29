package com.xrhm.javatutorial.学习.Util;


import org.apache.tomcat.util.threads.TaskThreadFactory;

import java.util.concurrent.*;

/*
 * 使用jdk threadpoolexecutor构建线程池
 * */
public class ThreadPoolUtil {
    private static int corePoolSize = 5;
    private static int maximumPoolSize = 10;
    private static int queueCapacity = 20;
    private static Long keepAliveTime = 60L;
    private static TimeUnit timeUnit = TimeUnit.SECONDS;
    private static ThreadFactory threadFactory = new TaskThreadFactory("jdkPoolTask-", true, 1);

    private static ExecutorService executorService = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, timeUnit,
            new LinkedBlockingQueue<>(queueCapacity), threadFactory, new ThreadPoolExecutor.AbortPolicy());

    public static ExecutorService getExecutorService() {
        return executorService;
    }


}
