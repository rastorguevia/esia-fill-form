package ru.rastorguev;

import ru.rastorguev.bootstrap.Bootstrap;

public class App {
    public static void main(String[] args) {

        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
