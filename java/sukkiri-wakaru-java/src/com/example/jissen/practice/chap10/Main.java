package com.example.jissen.practice.chap10;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Properties;

public class Main {
    public static void main(String args[]) {
        // 10-1
        try (var fr = new FileReader("./src/com/example/jissen/practice/chap10/pref.properties")) {
            var p = new Properties();
            p.load(fr);

            var aichiCapital = p.getProperty("aichi.capital");
            var aichiFood = p.getProperty("aichi.food");
            System.out.println(aichiCapital+ ":" + aichiFood);
        } catch (IOException e) {
            System.out.println("ファイルを読み込めませんでした");
            e.printStackTrace();
        }

        // 10-2
        var tanaka = new Employee();
        tanaka.name = "田中太郎";
        tanaka.age = 41;

        var somubu = new Department();
        somubu.name = "総務部";
        somubu.leader = tanaka;

        try (var fos = new FileOutputStream("./src/com/example/jissen/practice/chap10/company.dat");
             var oos = new ObjectOutputStream(fos)) {
                oos.writeObject(somubu);
                oos.flush();
        } catch (IOException e) {
            System.out.println("書き込みエラーが発生しました");
            e.printStackTrace();
        }

    }
}
