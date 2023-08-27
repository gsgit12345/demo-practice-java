package org.example.arrays.onedimensional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PeekInArray {
    public static void main(String str[]) {
        int arr[] = {1, 30, 20, 4, 1, 1, 70, 5, 8};
        int high = arr.length - 1;
        //int index=  findPeak(arr,high);
        //  System.out.println("found at index::"+index+"::peek valus is:;"+arr[index]);
        //findMinAndMax(arr);
        //  reverseSortedArray();
      //  mergeTwoSortedArray();
        mergeTwoArrayUsingJava8();
    }

    static int findPeak(int arr[], int n) {
        int low = 0;
        int high = n - 1;
        int mid = 0;
        while (low <= high) {
            // finding mid by binary right shifting.
            // mid = (l + r) >> 1;
            mid = (low + high) / 2;

            // first case if mid is the answer
            if ((mid == 0
                    || arr[mid - 1] <= arr[mid])
                    && (mid == n - 1
                    || arr[mid + 1] <= arr[mid]))
                break;

            // move the right pointer
            if (mid > 0 && arr[mid - 1] > arr[mid])
                high = mid - 1;

                // move the left pointer
            else
                low = mid + 1;
        }
        System.out.println("mid is ::" + mid);
        return mid;
    }

    public static void findMinAndMax(int arr[]) {
        OptionalInt max = Arrays.stream(arr).max();
        System.out.println("max is::" + max.getAsInt());
        OptionalInt min = Arrays.stream(arr).min();
        System.out.println("min is::" + min.getAsInt());
        int a[] = {1, 423, 6, 46, 34, 23, 13, 53, 4};
        //Implemented inbuilt function to sort array big(nlogn)
        Arrays.sort(a);
        // after sorting the value at 0th position will minimum and
        //nth position will be maximum
        System.out.println("min-" + a[0] + " max-" + a[a.length - 1]);
    }

    public static void reverseSortedArray() {
        int arr[] = {11, 12, 13, 14, 15, 16};
        System.out.println("length is::" + arr.length);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
        System.out.println("after reverse::" + Arrays.toString(arr));
        //useing stream api reversing a array

        //Intstream.rangedClosed(startInclusive,endInclusive) is similar to for loop for (int i = startInclusive; i <= endInclusive ; i++)
        int arr2[] = {11, 12, 13, 14, 15, 16};
        Object[] reversed = IntStream.rangeClosed(1, arr2.length).mapToObj(i -> arr2[arr2.length - i]).toArray();
        System.out.println("after reversed array::" + Arrays.toString(reversed));

        String[] typesOfInsurance = {"Cherry", "Pineapple", "Melon"};
        Object[] reversed2 = IntStream.rangeClosed(1, typesOfInsurance.length).mapToObj(i -> typesOfInsurance[typesOfInsurance.length - i]).toArray();
        System.out.println("after reversed eeee::" + Arrays.toString(reversed2));

    }

    public static void mergeTwoSortedArray() {
        int array[] = {1, 2, 3, 4, 5};
        int array2[] = {6, 7, 8, 9};

        int len1 = array.length;
        int len2 = array2.length;
        int mergedarray[] = new int[len1 + len2];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < len1 && j < len2) {
            if (array[i] < array2[j]) {
                mergedarray[k] = array[i];
                k++;
                i++;
            } else {
                mergedarray[k] = array2[j];
                k++;
                j++;
            }
        }
        while (i < len1) {
            mergedarray[k] = array[i];
            k++;
            i++;
        }
        while (j < len2) {
            mergedarray[k++] = array2[j++];

        }
        System.out.println(Arrays.toString(mergedarray));
    }
    public static void mergeTwoArrayUsingJava8()
    {
        int array[]={4,5,2,6,7};
        int array1[]={4,15,16,17,8};

        int arrays4[]= Stream.of(array,array1).flatMapToInt(Arrays::stream).toArray();
        System.out.println("first way::"+Arrays.toString(arrays4));
        List<Object> list = new ArrayList<>();

Stream.of(array,array1).flatMapToInt(Arrays::stream).forEach(list::add);

System.out.println(list.toString());

    }

}
