package org.example.designpattern.creational.Prototype.prototypewithoutclone;

public abstract class Tree {
    private double mass;
    private double height;
    public Tree(double mass, double height) {
        this.mass = mass;
        this.height = height;
    }
    public void setMass(double mass) {
        this.mass = mass;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getMass() {
        return mass;
    }
    public double getHeight() {
        return height;
    }
    @Override
    public String toString() {
        return "Tree [mass=" + mass + ", height=" + height + "]";
    }
    public abstract Tree copy();
}