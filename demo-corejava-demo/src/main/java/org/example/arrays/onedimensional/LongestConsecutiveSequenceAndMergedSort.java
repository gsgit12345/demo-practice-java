package org.example.arrays.onedimensional;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LongestConsecutiveSequenceAndMergedSort {
    public static void main(String str[]) {

        int array3[] = {3, 12, 71, 71, 4, 5, 0, 8, 8, 1, 2, 90, 23};
        int low = 0;
        int arr[] = {0, 1, 1, 1, 1, 1, 2, 3, 33, 5, 5};

        int high = array3.length - 1;
        int mergedArray[] = mergedSort(array3, low, high);
        // System.out.println("mergedArray::================================" + Arrays.toString(mergedArray));
        //mergedArray::================================[0, 1, 2, 3, 5, 33]

        //finding the longest consecutive in the array
        int arr4[] = {1, 9, 3, 3, 5, 6, 5, 10, 4, 20, 2};

        int longestConsecutive = longestConsecutiveSubSequenceInArray(arr4);
        System.out.println("longestConsecutive::================================" + longestConsecutive);
    int secondway=    longConsecutiveUsingHashing(arr4);
        System.out.println("secondway::================================" + secondway);

    }


    public static int longestConsecutiveSubSequenceInArray(int array[]) {
//timecomplexity:-O(NlogN)
        //space:-O(1)
        //  Longest Consecutive Subsequence using sorting without removing duplicate elements:
        //sort the array before finding largest consecutive
        int length = array.length - 1;
        int low = 0;
        array = mergedSort(array, low, length);
        System.out.println("in consecutive ::::" + Arrays.toString(array));
        int currentConsecutive = 1;
        int largestConsecutive = -1;
        for (int i = 0; i < length; i++) {
            if (array[i + 1] - array[i] == 1) {
                currentConsecutive++;
            } else if (array[i + 1] - array[i] == 0) {
                continue;
                //this is only for if array will contains duplicate elements.if array contains non-duplicate .else if block is not required
            } else {
                currentConsecutive = 1;
            }
            if (largestConsecutive < currentConsecutive) {
                largestConsecutive = currentConsecutive;
            }
        }
        return largestConsecutive;
    }

    public static int longConsecutiveUsingHashing(int array[]) {
        Set<Integer> hashSet = IntStream.of(array)        // Returns IntStream
                .boxed()
                .collect(Collectors.toSet());
      //1-  max_len = 0
        //2-for num in hash_set:
       //3- If num -1 not in hash_set:
      //4-  curr_len = 1
     //5-   while num + 1 in hash_set:
      //6-  curr_len += 1
      //7-  num += 1
      //8-  max_len = max(max_len, curr_len)
      //9-  return max_len
int max_len=0;
        for(int num:array)
        {
            if(!hashSet.contains(num-1))
            {
                int len = 1;
                // num is the array index
                while (hashSet.contains(num + len)) {
                    len++;
                }
max_len=max_len<len ?len :max_len;
            }
        }
return max_len;
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
        merged = removeDuplicate(merged);
        //   System.out.println("unique is::"+Arrays.toString(merged));
        return merged;
    }

    public static int[] removeDuplicate(int array[]) {
        int n = array.length;
        if (n == 0 || n == 1)
            return array;
        int j = 0;
        int tem[] = new int[array.length];
        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1])
                array[j++] = array[i];
        }
        return array;
    }
}
