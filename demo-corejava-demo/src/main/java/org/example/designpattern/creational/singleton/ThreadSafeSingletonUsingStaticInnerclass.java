package org.example.designpattern.creational.singleton;

public class ThreadSafeSingletonUsingStaticInnerclass {
    private static class SingletonLoader {
        static final ThreadSafeSingletonUsingStaticInnerclass INSTANCE = new ThreadSafeSingletonUsingStaticInnerclass();
    }
    private ThreadSafeSingletonUsingStaticInnerclass () {}

    public static ThreadSafeSingletonUsingStaticInnerclass getInstance() {
        return SingletonLoader.INSTANCE;
    }


}
