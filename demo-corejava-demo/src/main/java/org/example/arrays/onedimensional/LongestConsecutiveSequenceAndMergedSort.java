package org.example.arrays.onedimensional;

import java.util.Arrays;

public class LongestConsecutiveSequenceAndMergedSort {
    public static void main(String str[]) {

        int array3[] = {3,12, 71,71,4, 5,0, 8,8,1, 2, 90, 23};
        int low = 0;
        int arr[] = {0,1,1,1,1,1,2,3,33,5,5};

        int high = array3.length-1 ;
        int mergedArray[] = mergedSort(array3, low, high);
        System.out.println("mergedArray::================================" + Arrays.toString(mergedArray));
        //mergedArray::================================[0, 1, 2, 3, 5, 33]
    }


    public static void longestConsecutiveSubSequenceInArray(int array[])
    {
      //  Longest Consecutive Subsequence using sorting without removing duplicate elements:
        //int length=

    }
    public static int[] mergedSort(int array3[], int low, int high) {
        if (low == high) {
            int base[] = new int[1];
            base[0] = array3[high];
            return base;
        }
        int mid = low + (high - low) / 2;
        int array1[] = mergedSort(array3, low, mid);
        int array2[] = mergedSort(array3, mid + 1, high);
        int[] merged = mergeTwoSortedArray(array1, array2);
       // System.out.println("merged::" + Arrays.toString(merged));
        return merged;
    }

    public static int[] mergeTwoSortedArray(int array[], int array2[]) {
        int merged[] = new int[array.length + array2.length];

        int firstLength = array.length;
        int secondLength = array2.length;
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < firstLength && j < secondLength) {
            if (array[i] < array2[j]) {
                merged[k] = array[i];
                k++;
                i++;
            } else {
                merged[k] = array2[j];
                k++;
                j++;
            }
        }
        while (i < firstLength) {
            merged[k] = array[i];
            k++;
            i++;
        }
        while (j < secondLength) {
            merged[k] = array2[j];
            k++;
            j++;
        }
//removed duplicate form the sorted array
    //   merged=  removeDuplicate(merged);
     //   System.out.println("unique is::"+Arrays.toString(merged));
        return merged;
    }
public static int[] removeDuplicate(int array[])
{
    int n=array.length;
    if(n==0||n==1)
        return array;
    int j=0;
    int tem[]=new int[array.length];
    for(int i=0;i<n-1;i++)
    {
        if(array[i]!=array[i+1])
            array[j++]=array[i];
    }
    return array;
}
}
