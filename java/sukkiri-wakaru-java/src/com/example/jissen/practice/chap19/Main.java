package com.example.jissen.practice.chap19;

// 19-1
public class Main {
    public static void main(String args[]) {
        var countUpThread = new CountUpThread();
        var countUpThread2 = new CountUpThread();
        var countUpThread3 = new CountUpThread();
        countUpThread.run();
        countUpThread2.run();
        countUpThread3.run();
    }
}
