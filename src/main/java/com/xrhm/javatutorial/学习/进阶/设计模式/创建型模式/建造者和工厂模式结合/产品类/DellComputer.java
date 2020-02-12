package com.xrhm.javatutorial.学习.进阶.设计模式.创建型模式.建造者和工厂模式结合.产品类;

/*
 * Dell电脑抽象类，方便后续进行拓展
 *
 * */
public abstract class DellComputer implements Computer {
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
        return "Dell电脑玩游戏了~";
    }

    @Override
    public String playMusic() {
        //doSomething...
        return "Dell电脑放音乐了~";
    }

    @Override
    public String doOffice() {
        //doSomething...
        return "Dell电脑办公了~";
    }
}
