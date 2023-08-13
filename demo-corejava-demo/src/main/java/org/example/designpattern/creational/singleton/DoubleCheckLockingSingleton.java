package org.example.designpattern.creational.singleton;

public class DoubleCheckLockingSingleton {

    private static volatile DoubleCheckLockingSingleton instance;
    public static DoubleCheckLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLockingSingleton .class) {
                if (instance == null) {
                    instance = new DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }

}
