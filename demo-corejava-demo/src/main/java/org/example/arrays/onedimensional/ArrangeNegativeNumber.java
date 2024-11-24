package org.example.arrays.onedimensional;

import java.util.Arrays;

public class ArrangeNegativeNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int array[] = {-1, -4, 5, 7, 11, -23, 99, -34, 23, -90};

      //  int arr2[] = shiftNegative(array);
         int arr[] = arrangeNegativeNumberAtOneSide(array);

        System.out.println(Arrays.toString(arr));


    }

    public static int[] shiftNegative(int array[]) {
        int len = array.length;
        int i = -1;
        int pivot = 0;
        //big(n)
        for (int j = 0; j < len; j++) {
            //  if(array[j]>pivot) //this for right
            if (array[j] < pivot) //left
            {
                i++;
                // swap(array[i],array[j]);
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return array;
    }

    public static int[] arrangeNegativeNumberAtOneSide(int array[]) {
        int j = 0;
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (j != i) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
                j++;
            }

        }
        return array;
    }


}



