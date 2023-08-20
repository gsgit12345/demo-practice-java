package org.example.subjectivec8.identityfunc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatmap {
    public static void main(String str[])
    {
       // getSingleList();
        convertingNestedArrayIntoList();
    }
    public static void  getSingleList()
    {
        List<Integer> list1= Arrays.asList(10,11,12,13,14,15);
        List<Integer> list2= Arrays.asList(16,17,18,19,20,21);
        List<Integer> list3= Arrays.asList(17,19,20,21,22,23);

      List<List<Integer>> listofintgere=  Arrays.asList(list1,list2,list3);
     List<Integer> combineList=   listofintgere.stream().flatMap(stream->stream.stream()).collect(Collectors.toList());

     System.out.println(combineList.toString());

    }
    public static void  convertingNestedArrayIntoList()
    {
        String [][] dataArray=new String[][]{{"Ram","Shyam"},{"priti","kumari"},{"shilpa","shetty"}};

       List<String> combineArray= Arrays.stream(dataArray).flatMap(data->Arrays.stream(data)).collect(Collectors.toList());
       System.out.println("combinearray::"+combineArray.toString());
    }
}
