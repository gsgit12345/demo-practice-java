package org.example.designpattern.creational.Prototype.prototypewithoutclone;

public class TestDemo {
    public static void main(String str[])
    {

        double mass = 10.0;
        double height = 3.7;
        PlasticTree plasticTree = new PlasticTree(mass, height);
        PlasticTree plasticopy2=  (PlasticTree) plasticTree.copy();
        System.out.println("property::"+plasticopy2.getName());
        PineTree pineprototype = new PineTree(mass, height);

        PineTree pineTree=  (PineTree) pineprototype.copy();
        System.out.println("property pine tree::"+pineTree.getType());


    }
}
