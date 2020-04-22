package com.example.jissen.practice.chap11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

//11-1
public class FaviconGetter {
    public static void main(String args[]) {
        try {
            var faviconUrl = new URL("https://ao-system.net/favicon/common/favicons/favicon.ico");
            try (var is = faviconUrl.openStream();
                var os = new FileOutputStream("./src/com/example/jissen/practice/chap11/dj.ico")) {
                int i = is.read();
                while (i != -1) {
                    os.write((byte) i);
                    i = is.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println("URLが読み込めませんでした。");
        }
    }
}
