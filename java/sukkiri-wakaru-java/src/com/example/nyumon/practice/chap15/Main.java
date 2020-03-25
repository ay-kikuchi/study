package com.example.nyumon.practice.chap15;

import java.io.IOException;

public class Main {
    public static void main(String args[]) {
        // 15-1,2
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException例外をcatchしました");
            System.out.println("--スタックトレース(ここから)--");
            e.printStackTrace();
            System.out.println("--スタックトレース(ここまで)--");
        }

        // 15-3
        try {
            var three = "三";
            int i = Integer.parseInt(three);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
