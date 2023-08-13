package org.example.designpattern.creational.Prototype.prototypewithclone.deepcopy;

public class Department implements Cloneable{
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

    public Department(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
