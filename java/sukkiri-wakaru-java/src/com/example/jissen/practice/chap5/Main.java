package com.example.jissen.practice.chap5;

public class Main {
    public static void main(String args[]) {
        var box = new StrongBox(KeyType.DIAL);
        box.put("cat");
        var item = box.get();
        System.out.println(item); // nullになるはず
    }
}
