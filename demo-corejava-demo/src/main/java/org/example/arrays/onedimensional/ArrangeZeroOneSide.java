package org.example.arrays.onedimensional;

import java.util.Arrays;

public class ArrangeZeroOneSide {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int arr[] = {1, 4, 6, 0, 9, 0, 2, 0};
        int arr1[] = {1, 1, 1, 0, 1, 0, 1, 0};

        // int arr2[] = arrangeZeroRightSide(arr);
        int arr3[] = arrangeZeroLeftSide(arr);

        System.out.println(Arrays.toString(arr3));

    }


    public static int[] arrangeZeroRightSide(int array[]) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] != 0) {
                array[count++] = array[i];
            }
        }
        while (count < array.length)
            array[count++] = 0;


        return array;
    }

    public static int[] arrangeZeroLeftSide(int array[]) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0) {
                array[i] = 0;
                count++;
            }
        }
        //not working
        while (count < array.length)
            array[count++] = array[count];


        return array;
    }


    public static int[] arrangeZeroToTheStart(int array[]) {
        int j = array.length - 1;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != 0) {
                array[j] = array[i];
                j--;
            }

        }

        while (j >= 0) {
            array[j] = 0;
            j--;
        }
        return array;
    }

}
