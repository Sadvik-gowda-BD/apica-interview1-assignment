package com.apica.assignment.assignment3_singleton;

public final class MySingleton {
    private MySingleton(){}

    private static MySingleton instance;

    public static MySingleton getInstance() {
        if (instance == null) {
            synchronized (MySingleton.class) {
                if (instance == null) {
                    instance = new MySingleton();
                }
            }
        }
        return instance;
    }
}
