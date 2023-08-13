package org.example.designpattern.creational.BreakingSingleton;

import java.io.Serializable;

public class NotBreakingSingleton implements Serializable {
    private NotBreakingSingleton()
    {

    }
    private static final NotBreakingSingleton getInstance=new NotBreakingSingleton();
    protected Object readResolve() { return getInstance; }

    public static NotBreakingSingleton getInstance()
    {
        return getInstance;
    }

}
