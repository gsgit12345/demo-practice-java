package org.example.designpattern.creational.singleton;

public class ThreadSafeSingletonUsingStaticInitialization {
    private static final ThreadSafeSingletonUsingStaticInitialization instance;

    static {
        instance = new ThreadSafeSingletonUsingStaticInitialization();
    }

    private ThreadSafeSingletonUsingStaticInitialization() {
    }

    public static ThreadSafeSingletonUsingStaticInitialization getInstance() {
        return instance;
    }

}
