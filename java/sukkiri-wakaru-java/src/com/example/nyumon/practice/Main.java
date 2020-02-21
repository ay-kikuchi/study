package com.example.nyumon.practice;

public class Main {
    public static void main(String[] args) {
        // chap.10
        var wand1 = new Wand();
        wand1.setName("wand1");
        wand1.setPower(100);

        var wizard1 = new Wizard();
        wizard1.setHp(-100);
        wizard1.setMp(50);
        wizard1.setName("wizard1");
        wizard1.setWand(wand1);

        // chap.11
        var poisonMatango1 = new PoisonMatango('A');
        var hero1 = new Hero();
        hero1.setHp(50);
        poisonMatango1.attack(hero1);
    }
}
