package com.example.nyumon.practice;

public class PoisonMatango extends Matango {
    private int poisonAttackTimes = 5;

    PoisonMatango(char suffix) {
        super(suffix);
    }

    @Override
    public void attack(Hero h) {
        super.attack(h);
        if (poisonAttackTimes > 0) {
            System.out.println("さらに毒の胞子をばらまいた！");

            var damage = h.getHp() / 5;
            h.setHp(h.getHp() - damage);
            System.out.println(damage + "ポイントのダメージ");
            poisonAttackTimes--;
        }
    }
}
