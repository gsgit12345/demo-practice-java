package org.example.designpattern.BreakingSingleton;

import java.lang.reflect.Constructor;

public class UsingReflection
{
    public static void main(String str[])throws Exception
    {
        EagerSingleton singleton=EagerSingleton.getInstance();
        EagerSingleton singleton2=null;
        Constructor[] constructors = EagerSingleton.class.getDeclaredConstructors();

        for(Constructor construt:constructors)
        {
            construt.setAccessible(true);
            singleton2=  (EagerSingleton)construt.newInstance();
            break;
        }
       System.out.println("first object::"+singleton.hashCode());
        System.out.println("second object::"+singleton2.hashCode());

    }
}
