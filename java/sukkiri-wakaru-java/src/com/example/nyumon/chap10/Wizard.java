package com.example.nyumon.chap10;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    void heal(Hero h) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.wand.getPower());

        h.setHp(h.getHp() + recovPoint);

        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public String getName() {
        return name;
    }

    public Wand getWand() {
        return wand;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("MPは0以上を指定してください");
        }
        this.mp = mp;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("名前は3文字以上を指定してください");
        }
        this.name = name;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("杖はnull以外を指定してください");
        }
        this.wand = wand;
    }
}
