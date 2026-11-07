package org.example.narendra.array.practiceonly;

public class SwapStringWithoutThirdVar {
    public static void main(String str[])
    {
        System.out.println("Before Swapping :");
        String s1="hello";
        String s2="java";
        System.out.println("s1 : "+s1);
        System.out.println("s2 : "+s2);

//Swapping starts
        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length()-s2.length());
        s1 = s1.substring(s2.length());

//Swapping ends
        System.out.println("After Swapping :");
        System.out.println("s1 : "+s1);
        System.out.println("s2 : "+s2);

    }
}
