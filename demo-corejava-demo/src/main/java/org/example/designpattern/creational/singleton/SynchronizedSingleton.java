package org.example.designpattern.creational.singleton;

public class SynchronizedSingleton {

    private SynchronizedSingleton() {

    }

    private static SynchronizedSingleton lazySingleton;

    public static synchronized SynchronizedSingleton getInstance() {
        if (lazySingleton == null) {
            return lazySingleton = new SynchronizedSingleton();//two thread can enter in this block due to java memory model
        } else {
            return lazySingleton;
        }
    }

}
