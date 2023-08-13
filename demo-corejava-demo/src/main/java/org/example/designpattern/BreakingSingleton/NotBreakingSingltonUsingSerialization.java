package org.example.designpattern.BreakingSingleton;

import java.io.*;

public class NotBreakingSingltonUsingSerialization {
    public static void main(String str[]) throws IOException, ClassNotFoundException {
        NotBreakingSingleton instance=NotBreakingSingleton.getInstance();
        ObjectOutput outputStream=new ObjectOutputStream(new FileOutputStream("writeobject.txt"));
        outputStream.writeObject(instance);

        ObjectInput input = new ObjectInputStream(new FileInputStream("writeobject.txt"));
        NotBreakingSingleton singleton2=(NotBreakingSingleton)input.readObject();
        input.close();

        System.out.println("instance1 hashCode:- "
                + instance.hashCode());
        System.out.println("instance2 hashCode:- "
                + singleton2.hashCode());

    }
}
