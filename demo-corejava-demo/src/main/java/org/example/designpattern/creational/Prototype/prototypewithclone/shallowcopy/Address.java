package org.example.designpattern.creational.Prototype.prototypewithclone.shallowcopy;

public class Address {
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String name;
    public Address(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

}
