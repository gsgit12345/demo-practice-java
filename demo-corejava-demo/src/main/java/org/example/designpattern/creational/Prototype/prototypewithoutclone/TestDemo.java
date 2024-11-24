package org.example.designpattern.creational.Prototype.prototypewithoutclone;

public class TestDemo {
    public static void main(String str[])
    {

        double mass = 10.0;
        double height = 3.7;
        AppleTree appleTree = new AppleTree(mass, height);
        AppleTree applecopy2=  (AppleTree) appleTree.copy();
        System.out.println("property::"+appleTree.getName());
        MangoTree mangoprototype = new MangoTree(mass, height);

        MangoTree pineTree=  (MangoTree) mangoprototype.copy();
        System.out.println("property pine tree::"+pineTree.getType());


    }
}
