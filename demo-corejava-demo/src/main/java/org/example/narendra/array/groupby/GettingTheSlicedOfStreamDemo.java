package org.example.narendra.array.groupby;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GettingTheSlicedOfStreamDemo {
    public static void main(String str[])
    {
       List<Integer> arrayStream= Arrays.asList(2,3,1,2,34,5,6,7,8,9,0,11,12,13,15);
       int start=2;
       int end=arrayStream.size();
     List<Integer>  integerList= arrayStream.stream().skip(1).limit(end-2).collect(Collectors.toList());

     System.out.println(integerList.toString());
//sublist demo
       List<Integer> sublist= arrayStream.stream().collect(Collectors.toList()).subList(3,8);
       System.out.println(sublist.toString());


    }
}
