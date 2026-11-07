package org.example.narendra.array.exception;

import java.io.*;

class A {
    private int a = 10;

    public A() {
        System.out.println("A Constructor");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

class B extends A {
    private int b = 15;

    public B(int b) {       //No default Constructor Present
        System.out.println("B Constructor");
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

class C extends B implements Serializable {
    private int c = 25;

    public C() {
        super(500);
        System.out.println("C Constructor");
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}

class D extends C {
    private int d = 30;

    public D() {
        System.out.println("D Constructor");
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
}

public class MainClass_2 {

    public static void main(String[] args) {
        try {

            /****** SERIALIZATION ******/
            D d = new D();
            d.setA(100);
            d.setB(101);
            d.setC(102);
            d.setD(103);

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);

            System.out.println("Serializing Object...");
            oos.writeObject(d);
            oos.flush();
            baos.flush();
            oos.close();
            baos.close();

            /****** DE-SERIALIZATION ******/
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            System.out.println("Deserializing Object...");
            D deserializedD = (D) ois.readObject();

            System.out.println(deserializedD.getA());
            System.out.println(deserializedD.getB());
            System.out.println(deserializedD.getC());
            System.out.println(deserializedD.getD());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}