package org.example.arrays.onedimensional;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateNumberInArray {
    public static void main(String str[])
    {
        int[] array = {1, 2, 5, 5, 6, 6, 7, 2};
        String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};

       // findDuplicateNaiveWay(array);
       // findDuplicateinBign(array);
       // countDuplicateNumberInArray(array);
      //  countFrequencyUsingMap(array);
        int arr[] = { 9, 3,3,4, 9, 6, 7, 4 };

       int index= findFirstNonRepeating(arr);
       if(index==-1)
       {
           System.out.println("not found");
       }else {
           System.out.println(" found value :"+arr[index]+":at index:"+index);
       }

    }
    public static void findDuplicateNaiveWay(int array[])
    {
        for(int i=0;i<array.length-1;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]==array[j]&&(i!=j)) {
                    System.out.println("duplicate value in array:" + array[j]);
                }
            }
        }

    }
    public static void countDuplicateNumberInArray(int array[])
    {
        int len=array.length;
        boolean visited[]=new boolean[len];
        Arrays.fill(visited,false);

        for(int i=0;i<len ;i++)
        {
            if(visited[i]==true)
                continue;
            int count = 1;
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]==array[j])
                {
                    visited[i]=true;
                    count++;
                }
            }
            if(count!=1)
            {
                System.out.print(array[i]+" ");
            }
        }
    }
    public static void countFrequencyUsingMap(int array[])
    {
        Map<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<array.length;i++)
        {
            if(hashMap.containsKey(array[i]))
            {
                hashMap.put(array[i],hashMap.get(array[i])+1);
            }else
            {
                hashMap.put(array[i],1);
            }
        }
        System.out.println("map is::"+hashMap.toString());
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet())
        { if(entry.getValue()>1)
            System.out.println(entry.getKey()+" ");
        }

    }
    //Find duplicates in O(n) time and O(1) extra space |
    public static void findDuplicateinBign(int array[])
    {
        //int[] array = {1, 2, 5, 5, 6, 6, 7, 2};
        for (int i = 0; i < array.length; i++) {

            array[array[i] % array.length]
                    = array[array[i] % array.length]
                    + array.length;
        }
        //
       System.out.print("array is::"+ Arrays.toString(array));
        System.out.println("The repeating elements are : ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= array.length * 2) {
                System.out.println(array[i]);
                System.out.print(i + " ");
            }
        }


    }

    public static int findFirstNonRepeating(int array[])
    {
        //Find first non-repeating element in a given Array of integers
       // https://www.geeksforgeeks.org/non-repeating-element/
        int n=array.length;
        for (int i = 0; i < n; i++) {
            int j;
            // Checking if ith element is present in array
            for (j = 0; j < n; j++)
                if (i != j && array[i] == array[j])
                    break;
            // if ith element is not present in array
            // except at ith index then return element
            if (j == n)
                return i;
        }

        return -1;
    }

}
