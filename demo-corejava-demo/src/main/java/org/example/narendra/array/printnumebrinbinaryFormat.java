package org.example.narendra.array;

public class printnumebrinbinaryFormat {
    public static void main(String str[])
    {
        int a=6;
        System.out.println(Integer.toBinaryString(6));
        //-a is the tws complement
        int rightsetbitmask=a&-a;
        System.out.println(Integer.toBinaryString(rightsetbitmask));

    }
}
