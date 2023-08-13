package org.example.designpattern.creational.Prototype.prototypewithoutclone;

public class PineTree  extends Tree{
    private String type;

    public PineTree(double mass, double height) {
        super(mass, height);
        this.type = "Pine";
    }

    public String getType() {
        return type;
    }

    @Override
    public Tree copy() {
        PineTree pineTreeClone = new PineTree(this.getMass(), this.getHeight());
        return pineTreeClone;
    }

}
