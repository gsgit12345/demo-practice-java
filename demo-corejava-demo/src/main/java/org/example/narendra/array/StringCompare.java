package org.example.narendra.array;

public class StringCompare {
    public static void main(String str[])
    {
        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 = new String("HELLO");
        String s4 = new String("HELLO");
        if(s1 == s2)
            System.out.println("s1==s2"); //true
        if (s1.equals(s2)) //true
            System.out.println("s1.equals(s2)");
        if(s2 == s3) //flse
            System.out.println("s2==s3");
        else
            System.out.println("s2!=s3");
        if(s1.equals(s3)) //true
            System.out.println("s1.equals(s3)");
        if(s3 == s4)//false
            System.out.println("s3 == s4");
        if(s3.equals(s4))//true
            System.out.println("s3.equals(s4");
        s3 = s3.intern();
        if(s1==s3)  //true
        System.out.println("s1==s3"); //True
    }

}

