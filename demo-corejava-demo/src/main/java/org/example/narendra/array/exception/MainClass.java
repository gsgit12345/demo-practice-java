package org.example.narendra.array.exception;

public class MainClass{

    public static void main(String[] args) {
        Parent3 p = new Child2();
        p.print();
    }
}

class Parent3 {
    public static int x = 10;

    public void print() {
        System.out.println(x);
    }
}

class Child2 extends Parent3 {
    public static int x;
    public Child2() {
        x = 20;
    }
}
