package org.example.designpattern.creational.Prototype.prototypewithoutclone;

public class MangoTree extends Tree{
    private String type;

    public MangoTree(double mass, double height) {
        super(mass, height);
        this.type = "MangoTree";
    }

    public String getType() {
        return type;
    }

    @Override
    public Tree copy() {
        MangoTree pineTreeClone = new MangoTree(this.getMass(), this.getHeight());
        return pineTreeClone;
    }

}
