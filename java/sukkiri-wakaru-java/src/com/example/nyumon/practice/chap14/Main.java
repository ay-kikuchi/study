package com.example.nyumon.practice.chap14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// 14-1
public class Main {
    public static void main(String args[]) {
        var f = new SimpleDateFormat("西暦yyyy年MM月dd日");
        var now = new Date();
        var c = Calendar.getInstance();

        c.setTime(now);

        var day = c.get(Calendar.DAY_OF_MONTH);
        c.set(Calendar.DAY_OF_MONTH, day + 100);
        var newDate = c.getTime();

        String dateStr = f.format(newDate);
        System.out.println(dateStr);
    }
}
