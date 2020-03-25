package com.example.nyumon.practice.chap15;

import java.io.IOException;

public class AbnormalEnd {
    public static void main(String args[]) throws IOException {
        throw new IOException();
    }
}
