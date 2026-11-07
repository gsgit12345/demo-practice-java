package org.example.narendra.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWordInString {
    public static void main(String str[])
    {
        String st="hello i am going in the market";

      //  RevrseEachWord(st);
        RevrseEachWord(st);
    }

    public static void RevrseEachWord(String st)
    {
        List<String> ss= Arrays.asList(st.split(" "));
        String stt=ss.stream().collect(Collectors.reducing("",(w,w1)->w1+" "+w));
        System.out.println(stt);
    }
    public static void reversing(String str)
    {
        String []ss=str.split(" ");

        for(int i=ss.length-1;i>0;i--)
        {
            System.out.print(ss[i]+" ");
        }
    }
}
