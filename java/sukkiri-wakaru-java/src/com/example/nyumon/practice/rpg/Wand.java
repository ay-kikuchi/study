package com.example.nyumon.practice.rpg;

// 杖クラス
public class Wand {
    private String name;
    private double power;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("名前は3文字以上を指定してください");
        }
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        if (power < 0.5 || 100.0 < power) {
            throw new IllegalArgumentException("増幅率は0.5以上100.0以下を指定してください");
        }
        this.power = power;
    }
}
