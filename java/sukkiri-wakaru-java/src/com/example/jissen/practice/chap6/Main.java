package com.example.jissen.practice.chap6;



public class Main {
    public static void main(String args[]) {
        //6-1
        var funcList = new FuncList();
        Func1 func1 = FuncList::isOdd;
        Func2 func2 = funcList::addNamerPrefix;

        System.out.println(func1.call(2));
        System.out.println(func2.call(true, "Neko"));

        // 6-2
        Func1 func3 = x -> x % 2 == 1;
        Func2 func4 = (male, name) -> {
            if (male) {
                return "Mr." + name;
            } else {
                return "Ms." + name;
            }
        };
    }
}
