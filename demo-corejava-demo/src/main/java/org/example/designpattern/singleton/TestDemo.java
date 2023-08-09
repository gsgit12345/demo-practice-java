package org.example.designpattern.singleton;

public class TestDemo {
    public static void main(String str[])
    {
        EagerSingleton singleton=EagerSingleton.getInstance();
        System.out.println("hash code ::"+singleton.hashCode());
        EagerSingleton singleton2=EagerSingleton.getInstance();
        System.out.println("second hash code ::"+singleton2.hashCode());

        /////////////test lazySingleton////////////////////////

        LazySingleton lazySingleton=LazySingleton.getInstance();
        System.out.println("lazySingleton hash code ::"+lazySingleton.hashCode());
        LazySingleton lazySingleton2=LazySingleton.getInstance();
        System.out.println("lazySingleton second hash code ::"+lazySingleton2.hashCode());


    }
}
