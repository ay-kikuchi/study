package com.example.jissen.practice.chap9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class FileHandler {
    public void copyFile(String sourceFileName, String targetFileName) throws IOException {
        try (var fis = new FileInputStream(sourceFileName)) {
            try (var fos = new FileOutputStream(targetFileName, true)) {
                var bis = new BufferedInputStream(fis);
                var bos = new BufferedOutputStream(fos);
                var zipos = new GZIPOutputStream(bos);

                var i = bis.read();
                while (i != -1) {
                    zipos.write(i);
                    i = bis.read();
                }
                fos.flush();
            }
        } catch(Exception e) {
            System.out.println("ファイル操作に失敗しました。");
            e.printStackTrace();
        }
    }
}
