package org.example.Collection.forwardreferenceinjava;

public class FR2 {
    static int i=0;
    static
    {
      //  i=j;   //it is not ok .we can not use j as RHS
        j=i; //but we can initialize.

    }
    static int j=10;
}
