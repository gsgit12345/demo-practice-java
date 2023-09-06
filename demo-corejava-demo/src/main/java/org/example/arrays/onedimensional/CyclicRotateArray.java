package org.example.arrays.onedimensional;

import java.util.Arrays;

public class CyclicRotateArray {
    public static void main(String str[]) {
        int array[] = {1,  3, 4,5, 6};
        int rotate = 3;
        //   https://www.techiedelight.com/right-rotate-an-array-k-times/
        // rotateByOne(array);
        //  rotateArrayByKPosition(array, rotate);
        //int n = array.length;
       // int arr[] = rotateArray(array, n, rotate);
        //System.out.println(Arrays.toString(arr));

      //  findissingNumber(array);

        int[] arr2 = { 1, 5, 7, -1, 5 };
        int k = 10;
        // Function Call
        getPareCountInArray(arr2,k);
    }

    public static void rotateArrayByKPosition(int array[], int rotateIndex) {
        if (rotateIndex < 0 || rotateIndex > array.length)
            return;
        for (int i = 0; i < rotateIndex; i++) {
            rotateByOne(array);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void rotateByOne(int array[]) {
        int len = array.length;
        int temp = array[len - 1];
        for (int i = len - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;


    }

    public static int[] rotateArray(int[] arr, int n, int k) {
        if (k == 0) {
            return arr;
        }

        // rotate the array to the right by one position
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;

        // recursively rotate the remaining elements k-1 times
        return rotateArray(arr, n, k - 1);
        // System.out.println(Arrays.toString(arr));
    }

public static void findissingNumber(int num[])
{
    int len=num.length;
    int sum=((len+1)*(len+2))/2;

    for(int i=0;i<len;i++)
    {
        sum=sum-num[i];
    }
    System.out.println("missing number is::"+sum);
}

public static void getPareCountInArray(int array[],int paireNum)
{
    int count=0;
    // Consider all possible pairs and check their sums

    for(int i=0;i<array.length;i++)
    {
        for(int j=i+1;j<array.length;j++)
        {
            if(array[i]+array[j]==paireNum)
            {
                count++;
            }
        }
    }
    System.out.println("total paire is::"+count);
}
}
