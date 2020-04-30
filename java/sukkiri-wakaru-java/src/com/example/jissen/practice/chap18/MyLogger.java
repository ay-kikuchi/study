package com.example.jissen.practice.chap18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// 18-2
// singletonパターンを使用
public final class MyLogger {
    private static final String LOGFILE_PATH = "./src/com/example/jissen/practice/chap18/dummylog.txt";

    private static MyLogger myLogger;
    private static BufferedWriter bw;

    private MyLogger() {
        var logfilePath = Paths.get(LOGFILE_PATH);

        try {
            bw = Files.newBufferedWriter(logfilePath);
        } catch (IOException e) {
            System.out.println("ログファイル読み込みに失敗しました。");
            e.printStackTrace();
        }
    }

    public static MyLogger getInstance() {
        if (myLogger == null) {
            myLogger = new MyLogger();
        }
        return myLogger;
    }

    /**
     * ログを書き込む
     * @param line 1行分のログ
     */
    public static void log(String line) {
        try {
            bw.write(line);
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            System.out.println("ログファイル書き込みに失敗しました。");
            e.printStackTrace();
        }
    }
}
