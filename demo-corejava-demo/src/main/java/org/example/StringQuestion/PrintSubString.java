package org.example.StringQuestion;

public class PrintSubString {
    public static void main(String str[])
    {
String str1="hello";
       printSubString(str1,1,3);


    }

    public static void printSubString(String str,int start,int end)
    {
        if(str==null||str.length()<0)
            return ;

        if(start<end) {
            System.out.print(str.charAt(start));
            printSubString(str, start + 1, end);
        }

    }

}
