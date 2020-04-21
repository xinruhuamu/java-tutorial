package com.xrhm.javatutorial.学习.进阶.设计模式.行为型模式.状态模式;

public abstract class SubjectState implements State {
    protected SubjectContext context;

    protected boolean authenticated;

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    public void setContext(SubjectContext context) {
        this.context = context;
    }

    //已认证状态
    public abstract void authenticated();

    //未认证状态
    public abstract void unAuthenticated();


}
