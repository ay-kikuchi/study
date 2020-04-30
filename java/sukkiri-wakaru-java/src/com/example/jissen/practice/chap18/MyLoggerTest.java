package com.example.jissen.practice.chap18;

import org.junit.Test;

// 18-2
public class MyLoggerTest {
    @Test
    public void test() {
        var logger1 = MyLogger.getInstance();
        logger1.log("first");

        var logger2 = MyLogger.getInstance();
        logger2.log("second");

    }
}
