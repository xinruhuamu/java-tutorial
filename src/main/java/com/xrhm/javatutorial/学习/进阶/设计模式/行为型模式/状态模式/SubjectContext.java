package com.xrhm.javatutorial.学习.进阶.设计模式.行为型模式.状态模式;

public class SubjectContext implements Context {
    public static final AuthenticatedState authenticatedState = new AuthenticatedState();
    public static final UnAuthenticatedState unAuthenticatedState = new UnAuthenticatedState();

    private SubjectState subjectState;

    public SubjectState getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(SubjectState subjectState) {
        this.subjectState = subjectState;
        this.subjectState.setContext(this);
    }

    public void authenticated() {
        this.subjectState.authenticated();
    }

    public void unAuthenticated() {
        this.subjectState.unAuthenticated();
    }
}
