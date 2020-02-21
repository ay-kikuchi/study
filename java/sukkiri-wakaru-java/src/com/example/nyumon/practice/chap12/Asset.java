package com.example.nyumon.practice.chap12;

public abstract class Asset {
    private String name;

    Asset(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
