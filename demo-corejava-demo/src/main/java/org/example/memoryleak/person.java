package org.example.memoryleak;

public class person {
    public String name;

    public person(String name) {
        this.name = name;
    }
    //hashcode and equals are not overriden .if we will use this object as key in map.it will create memory leak
}