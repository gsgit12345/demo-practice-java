package org.example.arrays.onedimensional;

import java.util.Arrays;

public class RearrangePositiveNegatiiveInArray {

    public static void main(String str[]) {
        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        // rearrangePositiveNegative(arr);
        //  usingDutchNationalAlgorithmn(arr);
        int array[] = {0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0};
        //sort0and1(array);
        // rearrangeZeroToRight();
        //unionOfTwoSortedArray();
        printIntersection();
    }

    public static void rearrangePositiveNegative(int array[]) {
        int len = array.length;
        int i = 0;
        int j = 0;
        for (i = 0; i < len; i++) {
            //  if (array[i] > 0) {  //first positive and then negative
            if (array[i] < 0) {  //first negative and then positive
                if (i != j) {
                    swap(array, i, j);
                }
                j++;

            }
        }
        System.out.println("array is::" + Arrays.toString(array));
    }

    public static void usingDutchNationalAlgorithmn(int array[]) {
        int high = array.length - 1;
        int start = 0;
        while (start <= high) {
            if (array[start] < 0) {
                start++;
            } else {
                swap(array, start, high--);
            }

        }
        System.out.println(Arrays.toString(array));
    }

    public static void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void sort0and1(int array[]) {
        int zerospos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                continue;
            } else {
                array[i] = 1;
                array[zerospos++] = 0;

            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void rearrangeZeroToRight() {
        int array[] = {0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0};
        int n = array.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            //  if (array[i] == 0) {//this will put zero at start in array
            if (array[i] != 0) { //this will put zero last in the array
                //   Swap - A[j] , A[i]
                //swap(array, j, i); // Partitioning the array
                // i=1
                //       j=0
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(array));
    }

    public static void unionOfTwoSortedArray() {
        //https://www.geeksforgeeks.org/union-and-intersection-of-two-sorted-arrays-2/
        int arr1[] = {1, 2, 4, 5, 6};
        int arr2[] = {2, 3, 5, 7};

        // Integer[] firstArray = new Integer[] { 1, 3, 4, 5, 7 }; // source array
        //Integer[] secondArray = new Integer[] { 2, 3, 5, 6 }; // destination array
        //  Object[] union = Stream.of(firstArray, secondArray).flatMap(Stream::of).distinct().sorted().toArray();
        //Integer[] intersection = Stream.of(firstArray).filter(x -> Arrays.asList(secondArray).contains(x)).distinct()
        //      .toArray(Integer[]::new);
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i = nextDistinct(arr1, i);
            } else if (arr1[i] > arr2[j]) {
                System.out.print(arr2[j] + " ");
                j = nextDistinct(arr2, j);
            } else {
                System.out.print(arr1[i] + " ");
                i = nextDistinct(arr1, i);
                j = nextDistinct(arr2, j);
            }
        }

        while (i < arr1.length) {
            System.out.print(arr1[i] + " ");
            i = nextDistinct(arr1, i);
        }

        while (j < arr2.length) {
            System.out.print(arr2[j] + " ");
            j = nextDistinct(arr2, j);
        }
    }


    public static int nextDistinct(int[] arr, int x) {
        /*
        Helper function for printUnion(). This same function can also be implemented as a lambda function inside printUnion().
        This function moves to the next distinct element in the array.
        */
        while (x < arr.length - 1 && arr[x] == arr[x + 1]) {
            x++;
        }
        return x + 1;
    }

    public static void printIntersection() {
        int arr2[] = {1, 2, 2, 3, 4};
        int arr1[] = {2, 2, 4, 6, 7, 8};
        int m = arr1.length;
        int n = arr2.length;

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (i > 0
                    && arr1[i] == arr1[i - 1]) {// For Handling duplicates
                i++;
                continue;
            }
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }

    }
}
