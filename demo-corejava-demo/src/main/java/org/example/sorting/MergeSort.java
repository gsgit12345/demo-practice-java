package org.example.sorting;

import java.util.Arrays;

public class MergeSort {
int array[];
int temp[];
int length;
    public static void main(String str[]) {
        int array[] = {10, 32, 4, 12, 9, 15, 8, 90};
        MergeSort sort = new MergeSort();
    int arrays[]=    sort.mergeSort(array);
    System.out.println("sorted::"+Arrays.toString(arrays));
    }

    public  int[] mergeSort(int array[]) {
        this.array=array;
         this.length = array.length;
        int lower = 0;
        this.temp=new int[length];
        int higher = length - 1;
        divideArray(0, higher);
        return array;
    }

    public  void divideArray(int lower, int higher) {
        if (lower < higher) {
            int middle = lower + (higher - lower) / 2;
            divideArray(lower, middle);
            divideArray(middle + 1, higher);
            mergeArray(lower, higher, middle);
        }
    }

    public  void mergeArray(int lower, int higher, int middle) {

        for (int j = 0; j <= higher; j++) {
            temp[j] = array[j];
        }
        int i = lower;
        int j = middle + 1;
        int k = lower;

        System.out.println(Arrays.toString(temp));

        while (i <= middle && j <= higher) {
            if (temp[i] <= temp[j]) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = temp[i];
            i++;
            k++;

        }
        while (j <= higher) {
            array[k] = temp[j];
            j++;
            k++;

        }
    }
}
