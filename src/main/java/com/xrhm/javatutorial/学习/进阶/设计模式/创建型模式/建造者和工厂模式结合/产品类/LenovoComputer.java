package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.产品类;

/*
 * Lenovo电脑抽象类
 *
 * */
public abstract class LenovoComputer implements Computer {
    private String cpu;
    private String mainBoard;
    private String screen;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    @Override
    public String playGames() {
        //doSomething...
        return "Lenovo电脑玩游戏了~";
    }

    @Override
    public String playMusic() {
        //doSomething...
        return "Lenovo电脑放音乐了~";
    }

    @Override
    public String doOffice() {
        //doSomething...
        return "Lenovo电脑办公了~";
    }
}
