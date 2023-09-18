package org.example.StringQuestion;

public class ReverseAString {
    public static void main(String str[])
    {
        String hello="how are you and where you are u going";
       String result= reverseString(hello);
       System.out.println("resuld is::"+result);
    String result2=reverseStringUsingRecursion(hello);
        System.out.println("resuld222 is::"+result2);
        reverseWordInString(hello);
    }
    public static String reverseString(String st)
    {
        String reverse="";
        if(st==null||st.length()<1)
            return st;

        for(int i=st.length()-1;i>=0;i--)
        {
            reverse=reverse+st.charAt(i);
        }
        return reverse;
    }
    public static String  reverseStringUsingRecursion(String st)
    {
        if(st==null||st.length()<1)
            return st;

        return reverseStringUsingRecursion(st.substring(1))+st.charAt(0);
    }
    public  static void reverseWordInString(String st)
    {
        String word[]=st.split(" ");
        String reverseString="";
        for(int i=0;i<word.length;i++)
        {
            if(i==word.length-1)
            {
                reverseString=word[i]+reverseString;
            }else
            {
                reverseString=" "+word[i]+reverseString;
            }
        }
        //String hello="how are you and where you are u going";
        System.out.println("reversestr::"+reverseString);
    }
}
