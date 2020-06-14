package com.xrhm.javatutorial.学习.进阶.设计模式.行为型模式.责任链模式;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Client {

    public static void main(String[] args) {
        //创建执行者对象
        OrderHandler officer = new OfficerHandler();
        OrderHandler manager = new ManagerHandler();
        OrderHandler chairMan = new ChairManHandler();

        //创建责任链
        officer.setOrderHandler(manager);
        manager.setOrderHandler(chairMan);

        //创建采购单
        OrderRequest order = new OrderRequest();
        order.setAmount(7000);

        //采购单请求执行，从officer开始
        officer.handleOrder(order);

    }
}
