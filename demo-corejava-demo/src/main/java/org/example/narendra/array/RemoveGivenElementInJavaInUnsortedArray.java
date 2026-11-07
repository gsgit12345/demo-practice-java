package org.example.narendra.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveGivenElementInJavaInUnsortedArray {
    public static void main(String str[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13};

        int unsorted[] = {3, 12, 56, 23, 67, 8, 1, 90, 23, 90};

        int element = 90;

        int count[] = removeSingleElement(arr, element);

        for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[i]+" ");
        }
      //  System.out.print(Arrays.toString(count));

        removeAnElementFromArrayJdk8(unsorted,element);
    }

    public static int[] removeSingleElement(int arr[], int num) {
        if (arr == null || num < 0 || num >= arr.length) {
            return arr;
        }
        // Copy the elements except the index
        // from original array to the other array
        //int k=0;
        int arr2[] = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (arr[i] == num)
                continue;
            arr2[k++] = arr[i];
        }
        return arr2;
    }
    public static void removeAnElementFromArrayJdk8(int arra[],int element)
    {

//below logic will work in sorted and unsorted array
    Integer[] array3= IntStream.of(arra).boxed().filter(b->b!=element).toArray(Integer[]::new);
        System.out.println(Arrays.toString(array3));

    }
}
