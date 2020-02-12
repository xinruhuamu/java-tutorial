package com.xrhm.javatutorial.学习.进阶.多线程JUC;

import com.dcqc.javatutorial.学习.Util.ThreadPoolUtil;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private final AsyncTimeService asyncTimeService;

    public TestService(AsyncTimeService asyncTimeService) {
        this.asyncTimeService = asyncTimeService;
    }

    public void doTestOfSpringPool() {
        System.out.println("使用spring线程池执行" + Thread.currentThread().getName() + ",ID:" + Thread.currentThread().getId());
        for (int i = 0; i < 10; i++) {
            asyncTimeService.doCount();
        }
    }

    public void doTestOfJdkPool() {
        System.out.println("使用jdk线程池执行" + Thread.currentThread().getName() + ",ID:" + Thread.currentThread().getId());
        for (int i = 0; i < 10; i++) {
            ThreadPoolUtil.getExecutorService().execute(asyncTimeService::doCountOfJdkPool);
        }

    }

    public void doLockTest() {
        System.out.println("使用spring线程池执行" + Thread.currentThread().getName() + ",ID:" + Thread.currentThread().getId());
        System.out.println("使用ReentrantLock加锁方式");
        for (int i = 0; i < 10; i++) {
            asyncTimeService.doCountOfLock();
        }
    }
}
