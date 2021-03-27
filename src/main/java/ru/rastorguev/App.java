package ru.rastorguev;

import ru.rastorguev.bootstrap.Bootstrap;

public class App {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(((double) System.currentTimeMillis() - start) / 1000 + " sec");

    }
}
