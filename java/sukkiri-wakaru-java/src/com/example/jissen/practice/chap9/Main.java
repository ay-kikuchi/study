package com.example.jissen.practice.chap9;

public class Main {
    public static void main(String args[]) throws Exception{
        var handler = new FileHandler();
        handler.copyFile("./src/com/example/jissen/practice/chap9/test.txt",
                "./src/com/example/jissen/practice/chap9/test_copy.txt");
    }
}
