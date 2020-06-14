package com.xrhm.javatutorial.学习.进阶.设计模式.行为型模式.责任链模式;

/*
 * 抽象处理类
 * */
public abstract class OrderHandler {
    //自关联，维持对下家的引用，保证链条
    protected OrderHandler orderHandler;

    //1.设置后续链处理者
    public void setOrderHandler(OrderHandler orderHandler) {
        this.orderHandler = orderHandler;
    }

    /*
     * 2.处理请求的行为
     * */
    public abstract void handleOrder(OrderRequest order);
}
