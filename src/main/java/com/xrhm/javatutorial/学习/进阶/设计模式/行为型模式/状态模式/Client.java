package com.xrhm.javatutorial.学习.进阶.设计模式.行为型模式.状态模式;

public class Client {
    public static void main(String[] args) {
        SubjectContext context =new SubjectContext();
        context.setSubjectState(new AuthenticatedState());
        // context.authenticated();
        context.unAuthenticated();
        System.out.println("结束");
    }
}
