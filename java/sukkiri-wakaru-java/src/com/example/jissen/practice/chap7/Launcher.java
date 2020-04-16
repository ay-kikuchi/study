package com.example.jissen.practice.chap7;

import java.lang.reflect.Array;
import java.lang.reflect.Method;

public class Launcher {
    public static void main(String args[]) throws Exception {
        if (args.length != 2) {
            System.out.println("引数の数が違います");
            System.exit(1);
        }
        var classFQCN = args[0];
        var startWayChar = args[1];

        showMemoryUsage();

        try {
            var targetClass = Class.forName(classFQCN);
            showMethodList(targetClass);

            var mainMethod = targetClass.getDeclaredMethod("main", String[].class);

            switch (startWayChar) {
                case "E":
                    // 別プロセスとして起動
                    var pb = new ProcessBuilder("java", classFQCN);
                    var process = pb.start();
                    process.waitFor();
                    break;
                case "I":
                    // リフレクションで呼び出し
                    mainMethod.invoke(null, (Object) args);
                    break;
                default:
                    throw new IllegalArgumentException( startWayChar + "には対応していません");
            }
            showMemoryUsage();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private static void showMemoryUsage() {
        var totalMemory = Runtime.getRuntime().totalMemory();
        var freeMemory = Runtime.getRuntime().freeMemory();
        var memoryUsage = (totalMemory - freeMemory) / (1024 * 1024);
        System.out.println("メモリ使用量: " + memoryUsage + "MB");
    }

    private static void showMethodList(Class<?> targetClass) {
        var methodList = targetClass.getDeclaredMethods();

        System.out.println("メソッド一覧");
        for (Method method: methodList) {
            System.out.println("* " + method.getName());
        }
    }
}
