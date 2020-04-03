package com.example.jissen.practice.chap2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String args[]) {
        var formatStr = "西暦yyyy年MM月dd日";
        var sdf = new SimpleDateFormat(formatStr);
        var dtf = DateTimeFormatter.ofPattern(formatStr);

        // 2-1
        // Dateを使うver
        var now = new Date();
        var c = Calendar.getInstance();
        c.setTime(now);

        var day = c.get(Calendar.DAY_OF_MONTH);
        c.set(Calendar.DAY_OF_MONTH, day + 100);
        var future = c.getTime();

        String dateStr = sdf.format(future);
        System.out.println(dateStr);

        // 2-2
        // TIme APIを使うver
        var now2 = LocalDate.now();
        var future2 = now2.plusDays(100);

        String dateStr2 = future2.format(dtf);
        System.out.println(dateStr2);
    }
}
