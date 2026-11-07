package org.example.narendra.array;

public class StringComparison {
    public static void main(String str[])
    {
        String s1 = "Kohli";
        String s2 = "Kohli";
        String s3 = new String("Kohli");

        //s3=s3.intern();
        if(s1==s3)
        {
            System.out.println("internequal");
        }else
        {
            System.out.println("notinternequal");

        }
        if(s1==s2)
        {
            System.out.println("equal");
        }else
        {
            System.out.println("not equal");

        }
    }
}
