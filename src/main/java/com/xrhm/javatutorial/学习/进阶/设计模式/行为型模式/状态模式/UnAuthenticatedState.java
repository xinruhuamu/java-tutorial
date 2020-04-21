package com.xrhm.javatutorial.学习.进阶.设计模式.行为型模式.状态模式;

public class UnAuthenticatedState extends SubjectState {

    @Override
    public void authenticated() {

        //状态修改
        super.context.setSubjectState(SubjectContext.authenticatedState);
        super.context.getSubjectState().authenticated();
    }

    @Override
    public void unAuthenticated() {
        System.out.println("未认证状态");
    }
}
