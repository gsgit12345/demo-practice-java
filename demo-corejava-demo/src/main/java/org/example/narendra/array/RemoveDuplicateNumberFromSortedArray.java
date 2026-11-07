package org.example.narendra.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateNumberFromSortedArray {
    public static void main(String str[]) {
        int arr[] = {1, 2, 2, 3, 3, 4, 5, 6, 7, 8, 8, 9, 9, 9, 10, 10, 11, 11, 13, 13};

        int arrr = removeDuplicateFromArray(arr);

        for (int i = 0; i < arrr; i++) {
            //     System.out.print(arr[i] + " ");
        }
        int unsorted[] = {3, 12, 56, 23, 67, 8, 1, 90, 23, 90};


        int array1 = removeElementFromUnsortedArray(unsorted);

        // [3, 12, 56, 23, 67, 8, 1, 90, 23]

        for (int i = 0; i < array1; i++) {
           // System.out.print(unsorted[i] + " ");
        }

        removeDuplicateFromUnsotedArray(unsorted);
    }

    //https://www.geeksforgeeks.org/remove-duplicates-sorted-array/
    public static int removeDuplicateFromArray(int arr[]) {
        int len = arr.length;
        int idx = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[idx] = arr[i];
                idx++;
            }
        }
        return idx;
    }

    public static int removeElementFromUnsortedArray(int array[]) {

        Arrays.sort(array);
        int j = 1;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] != array[i - 1]) {
                array[j] = array[i];
                j++;
            }
        }
        // array[j++]=array[array.length-2];
        return j;
    }

    public static void removeDuplicateFromUnsotedArray(int array[]) {
        Set<Integer> unique = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            if (!unique.contains(array[i])) {
                //unique.add(array[i]);
            }
        }
       // System.out.println(unique);


        Set<Integer> un=Arrays.stream(array).mapToObj(a->a).collect(Collectors.toSet());
        System.out.println("un is:;"+un);

    }
}
