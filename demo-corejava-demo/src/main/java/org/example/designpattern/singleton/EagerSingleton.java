package org.example.designpattern.singleton;

public class EagerSingleton {

    private EagerSingleton()
    {

    }
    private static final EagerSingleton getInstance=new EagerSingleton();

    public static EagerSingleton getInstance()
    {
        return getInstance;
    }
}
