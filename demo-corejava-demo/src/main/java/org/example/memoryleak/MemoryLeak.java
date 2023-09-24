package org.example.memoryleak;

import java.util.ArrayList;

class EnclosingClass
{
    private int[] data;

    public EnclosingClass(int size)
    {
        data = new int[size];
    }

    class EnclosedClass
    {
    }

    EnclosedClass getEnclosedClassObject()
    {
        return new EnclosedClass();
    }
}

public class MemoryLeak
{
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList<>();
        int counter = 0;
        while (true)
        {
            al.add(new EnclosingClass(100000).getEnclosedClassObject());
            System.out.println(counter++);// this code will create memory leak
        }
    }
}
