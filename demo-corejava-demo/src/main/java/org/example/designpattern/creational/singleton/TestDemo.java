package org.example.designpattern.creational.singleton;

public class TestDemo {
    public static void main(String str[])
    {
        EagerSingleton singleton= EagerSingleton.getInstance();
        System.out.println("hash code ::"+singleton.hashCode());
        EagerSingleton singleton2= EagerSingleton.getInstance();
        System.out.println("second hash code ::"+singleton2.hashCode());

        /////////////test lazySingleton////////////////////////

        LazySingleton lazySingleton= LazySingleton.getInstance();
        System.out.println("lazySingleton hash code ::"+lazySingleton.hashCode());
        LazySingleton lazySingleton2= LazySingleton.getInstance();
        System.out.println("lazySingleton second hash code ::"+lazySingleton2.hashCode());

/////////////test staticinnerclass////////////////////////

        ThreadSafeSingletonUsingStaticInnerclass staticinner= ThreadSafeSingletonUsingStaticInnerclass.getInstance();
        System.out.println("ThreadSafeSingletonUsingStaticInnerclass hash code ::"+staticinner.hashCode());
        ThreadSafeSingletonUsingStaticInnerclass staticinner2= ThreadSafeSingletonUsingStaticInnerclass.getInstance();
        System.out.println("ThreadSafeSingletonUsingStaticInnerclass second hash code ::"+staticinner.hashCode());

       /// =============== testing singletn enum===========
        SingletonEnum singletonEnum =SingletonEnum.INSTANCE;
        System.out.println("first value:---"+singletonEnum.getValue());
        SingletonEnum singletonEnum2 =SingletonEnum.INSTANCE;
        System.out.println("second value:---"+singletonEnum2.getValue());

    }
}
