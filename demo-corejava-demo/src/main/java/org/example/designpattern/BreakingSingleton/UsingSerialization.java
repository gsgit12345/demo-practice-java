package org.example.designpattern.BreakingSingleton;

import java.io.*;

public class UsingSerialization {
    public static void main(String str[]) throws IOException, ClassNotFoundException {
        EagerSingleton instance1=EagerSingleton.getInstance();
        ObjectOutput outputStream=new ObjectOutputStream(new FileOutputStream("writeobject.txt"));
        outputStream.writeObject(instance1);

        ObjectInput input = new ObjectInputStream(new FileInputStream("writeobject.txt"));
        EagerSingleton singleton2=(EagerSingleton)input.readObject();
        input.close();

        System.out.println("instance1 hashCode:- "
                + instance1.hashCode());
        System.out.println("instance2 hashCode:- "
                + singleton2.hashCode());

    }
}
