package ru.geekbrains.java.hw8;

import java.util.Random;

public class HomeWorkApp {

    public static void main(String[] args) {
        ChainingHashMap<Integer, String> map = new ChainingHashMap<>(7);
        Random random = new Random();
        int x=0;
        for (int i = 0; i < 10; i++) {
            x=random.nextInt(100);
            map.put(x, "");
        }
        System.out.println(map);
        map.delete(56);
        //System.out.println("Удален элемент с ключом "+x);
        System.out.println(map);
    }

}
