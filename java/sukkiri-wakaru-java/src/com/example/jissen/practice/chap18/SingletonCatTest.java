package com.example.jissen.practice.chap18;

import org.junit.Test;

public class SingletonCatTest {
    @Test
    public void test() {
        var cat = SingletonCat.getInstance();
        cat.setAge(3);
        System.out.println(cat.getAge());
    }
}
