package org.example.java8subjectiveQuestion;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Java8SubjectiveQuetionForInterview2 {
    public static void main(String str[])
    {
//sum of n natural number in array
        Integer  sum=IntStream.range(1,11).sum();   //0 is not a natural number

        System.out.println("sum is:;"+sum);
        //reverse a integer array
        int array[]={1,90,11,34,2,10,11,23,9};
       int reverse[]= IntStream.rangeClosed(1,array.length).map(i->array[array.length-i]).toArray();
       System.out.println("reversing the array::"+Arrays.toString(reverse));
       // reverseArray(array);
        reverseArrayUsingTemp(array);

    }
    public static int[] reverseArray(int array[])
    {
        int len=array.length;
        int j=len;
        int num[]=new int[len];

        for(int i=0;i<len;i++)
        {
            num[j-1]=array[i];
            j--;
        }
         array=num;
        num=null;
        System.out.println(Arrays.toString(array));

        //////////////////reverse array using swap
        return array;


    }
    public static int[] reverseArrayUsingTemp(int array[])
    {
        int length=array.length;
        for(int i=0;i<length/2;i++)
        {
            int temp=array[i];
            array[i]=array[length-i-1];
            array[length-i-1]=temp;

        }
        System.out.println(Arrays.toString(array));

        return array;
    }


}
