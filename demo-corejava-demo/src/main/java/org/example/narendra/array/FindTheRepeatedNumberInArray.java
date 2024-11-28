package org.example.narendra.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindTheRepeatedNumberInArray {
    public static void main(String str[])
    {
        int a[]={1,2,3,4,6,7,8,9,10,34,6,8,9};
      //  findDuplicateInArray(a);

        printDuplicate(a);
        //print duplicate numebr
    }
    public static void findDuplicateInArray(int a[])
    {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        Set<Integer> duplicate=new HashSet<>();
        for(int v:a)
        {
            if(hmap.containsKey(v))
            {
                duplicate.add(v);
                int count=hmap.get(v);
                hmap.put(v,count+1);
            }
            else
            {
                hmap.put(v,1);
            }
        }
        System.out.println(duplicate);
    }
    public static void printDuplicate(int array[])
    {
        int low=0;
        int high=array.length-1;
        for(int i=0;i<array.length-1;i++)
        {
            //high--;

            if(array[i]==array[i+1])
            {
                System.out.println(array[i]);
            }
        }

    }
}
