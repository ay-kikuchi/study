package com.example.jissen.practice.chap3;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String args[]) {
        // 3-2
        var saito = new Hero("Saito");
        var suzuki = new Hero("Suzuki");

        var heroList = new ArrayList<Hero>();
        heroList.add(saito);
        heroList.add(suzuki);
        for (Hero hero: heroList) {
            System.out.println(hero.getName());
        }

        // 3-3
        var heroEnemyNumMap = new HashMap<Hero, Integer>();
        heroEnemyNumMap.put(saito, 3);
        heroEnemyNumMap.put(suzuki, 7);

        for (Hero hero: heroEnemyNumMap.keySet()) {
            int enemyNum = heroEnemyNumMap.get(hero);
            System.out.println(hero.getName() + "が倒した数=" + enemyNum);
        }
    }

}
