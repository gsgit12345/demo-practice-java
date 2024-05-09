package org.example.Collection.forwardreferenceinjava;

public class FR1 {
    static
    {
       // System.out.println(i); //Illegal forward reference
        // because we are using before its declaration
        i=10; //initialization is ok
    }
    static int i=0;
}
