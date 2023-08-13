package org.example.designpattern.creational.BreakingSingleton;

public class BreakingSingletonUsingClone {
    public static void main(String str[]) throws CloneNotSupportedException {
        Singleton instance1 = Singleton.instance;
        Singleton instance2 = (Singleton) instance1.clone();
        System.out.println("instance1 hashCode:- "
                + instance1.hashCode());
        System.out.println("instance2 hashCode:- "
                + instance2.hashCode());

    }
}
