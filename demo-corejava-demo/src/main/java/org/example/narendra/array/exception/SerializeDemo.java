package org.example.narendra.array.exception;

import java.io.*;
class third
{
    public third()
    {
        System.out.println("class third");
    }
}
class Parent5 extends third implements Serializable  {
    public Parent5() {
        System.out.println("Parent Constructor");
    }
}

class Child5 extends Parent5 {
    public Child5() {
        System.out.println("Child Constructor");
    }
}

public class SerializeDemo {

    public static void main(String[] args) {
        try {

            /****** SERIALIZATION ******/
            Child5 c = new Child5();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);

            System.out.println("Serializing Object...");
            oos.writeObject(c);
            oos.flush();
            baos.flush();
            oos.close();
            baos.close();

            /****** DE-SERIALIZATION ******/
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            System.out.println("Deserializing Object...");
            Child5 deserializedChild = (Child5) ois.readObject();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}