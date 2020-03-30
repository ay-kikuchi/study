package com.example.jissen.practice.chap1;

public class Main {
    // 1-2
    public String createFullPath(String folderName, String fileName) {
        if (!folderName.endsWith("/")) {
            folderName = folderName + "/";
        }

        var fullPath = folderName + fileName;
        return fullPath;
    }

    public static void main(String args[]) {
        // 1-1
        var sb = new StringBuilder();
        for (int i = 0; i < 101; i++) {
            sb.append(i).append(",");
        }
        var a = sb.toString();
        System.out.println(a);

        // 1-3
        var re1 = ".*";
        var re2 = "A\\d{1,2}";
        var re3 = "U[A-Z]{3}";
        System.out.println("UNYA".matches(re3));
    }
}
