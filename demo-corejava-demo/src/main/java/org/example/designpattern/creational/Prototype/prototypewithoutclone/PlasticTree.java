package org.example.designpattern.creational.Prototype.prototypewithoutclone;

public class PlasticTree  extends Tree{
    private String name;

    public PlasticTree(double mass, double height) {
        super(mass, height);
        this.name = "PlasticTree";
    }
    public String getName() {
        return name;
    }
    @Override
    public Tree copy() {
        PlasticTree plasticTreeClone = new PlasticTree(this.getMass(), this.getHeight());
        return plasticTreeClone;

    }
}
