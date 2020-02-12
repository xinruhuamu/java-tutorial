package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.建造者模式;

/*
 * 具体产品类，Car，被建造的对象
 * */
public class Car {
    private String engine;//引擎
    private String horn;//喇叭
    private String tire;//轮胎

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getHorn() {
        return horn;
    }

    public void setHorn(String horn) {
        this.horn = horn;
    }

    public String getTire() {
        return tire;
    }

    public void setTire(String tire) {
        this.tire = tire;
    }

    public String doRun() {
        return "汽车跑起来了~";
    }
}
