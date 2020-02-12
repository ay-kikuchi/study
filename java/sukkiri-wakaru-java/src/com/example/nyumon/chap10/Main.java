package com.example.nyumon.chap10;

public class Main {
    public static void main(String[] args) {
        var wand1 = new Wand();
        wand1.setName("wand1");
        wand1.setPower(100);

        var wizard1 = new Wizard();
        wizard1.setHp(-100);
        wizard1.setMp(50);
        wizard1.setName("wizard1");
        wizard1.setWand(wand1);
    }
}
