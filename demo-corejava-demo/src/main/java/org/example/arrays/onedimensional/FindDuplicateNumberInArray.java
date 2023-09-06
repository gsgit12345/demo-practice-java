package org.example.arrays.onedimensional;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindDuplicateNumberInArray {
    public static void main(String str[])
    {
        int[] array = {1, 2, 5, 5, 6, 6, 7, 2};
        String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};

       // findDuplicateNaiveWay(array);
        findDuplicateinBign(array);
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
}
