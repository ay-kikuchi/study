package com.example.nyumon.practice.chap12;

public abstract class TangibleAsset extends Asset {
    private int price;
    private String color;

    public TangibleAsset(String name, int price, String color) {
        super(name);
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}
