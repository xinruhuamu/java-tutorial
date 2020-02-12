package com.xrhm.javatutorial.学习.基础.Java三大特性;

public class GarfieldCat extends Cat {
    private String eyeColor;
    private String skinColor;
    private final static String VOICE = "喵喵喵~";

    public String eats(String foodName) {
        return foodName;
    }

    public String play() {
        return "ball";
    }

    public String play(String name) {
        return "lion";
    }

    private String catchMouse(String name) {
        return name;
    }
}
