package com.example.jissen.practice.chap6;

public class FuncList {

    public static boolean isOdd(int x) {
        return x % 2 == 1;
    }

    public String addNamerPrefix(boolean male, String name) {
        if (male == true) {
            return "Mr." + name;
        } else {
            return "Ms." + name;
        }
    }
}
