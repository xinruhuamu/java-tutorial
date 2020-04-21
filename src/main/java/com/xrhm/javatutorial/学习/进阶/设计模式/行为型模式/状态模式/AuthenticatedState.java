package com.xrhm.javatutorial.学习.进阶.设计模式.行为型模式.状态模式;

public class AuthenticatedState extends SubjectState {
    //认证状态
    @Override
    public void authenticated() {
        super.authenticated = true;
        System.out.println("现在是认证状态");
    }

    //状态切换，切换为未认证状态
    @Override
    public void unAuthenticated() {

        //先切换state
        super.context.setSubjectState(SubjectContext.unAuthenticatedState);
        //再具体行动
        super.context.getSubjectState().unAuthenticated();
        super.context.getSubjectState().authenticated = false;

    }
}
