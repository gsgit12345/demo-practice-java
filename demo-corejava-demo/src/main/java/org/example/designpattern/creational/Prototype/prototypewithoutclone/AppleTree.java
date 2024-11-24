package org.example.designpattern.creational.Prototype.prototypewithoutclone;

public class AppleTree extends Tree{
    private String name;

    public AppleTree(double mass, double height) {
        super(mass, height);
        this.name = "AppleTree";
    }
    public String getName() {
        return name;
    }
    @Override
    public Tree copy() {
        AppleTree appleTreeClone = new AppleTree(this.getMass(), this.getHeight());
        return appleTreeClone;

    }
}
