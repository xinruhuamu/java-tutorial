package com.xrhm.javatutorial.学习.进阶.设计模式.行为型模式.责任链模式;

public class ManagerHandler extends OrderHandler {

    @Override
    public void handleOrder(OrderRequest order) {
        if (order.getAmount() > 5000 && order.getAmount() <= 10000) {
            System.out.println("这个采购单由经理处理了~");
        } else {
            this.orderHandler.handleOrder(order);
        }
    }
}
