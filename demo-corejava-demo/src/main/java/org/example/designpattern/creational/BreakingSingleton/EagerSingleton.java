package org.example.designpattern.creational.BreakingSingleton;

import java.io.Serializable;

public class EagerSingleton implements Serializable {

    private EagerSingleton()
    {

    }
    private static final EagerSingleton getInstance=new EagerSingleton();

    public static EagerSingleton getInstance()
    {
        return getInstance;
    }
}
