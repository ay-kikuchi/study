package com.example.jissen.practice.chap18;

public final class SingletonCat {
    private static SingletonCat singletonCat;
    private static int age;

    private SingletonCat() {}

    public static SingletonCat getInstance() {
        if (singletonCat == null) {
            singletonCat = new SingletonCat();
        }
        return singletonCat;
    }

    public static int getAge() {
        return singletonCat.age;
    }

    public static void setAge(int age) {
        singletonCat.age = age;
    }
}
