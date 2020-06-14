package com.xrhm.javatutorial.学习.进阶.设计模式.行为型模式.责任链模式;

/*
 * 具体处理类1
 * */
public class OfficerHandler extends OrderHandler {

    @Override
    public void handleOrder(OrderRequest order) {
        if (order.getAmount() <= 5000) {
            System.out.println("这个采购单由组长处理了~");
        } else {
            this.orderHandler.handleOrder(order);//将请求转给经理处理
        }
    }
}
