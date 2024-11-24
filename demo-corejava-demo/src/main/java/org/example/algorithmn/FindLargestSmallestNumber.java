package org.example.algorithmn;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class FindLargestSmallestNumber {

    public static void main(String[] args) {

        //numbers array
        int numbers[] = new int[]{55, 32, 45, 98, 82, 11, 9, 39, 50};

        // int result[] = findMinMaxInArray(numbers);
        int result[] = findMinMaxInArrayUsingJava8(numbers);
        System.out.println("min num::" + result[0]);
        System.out.println("max num::" + result[1]);

        //assign first element of an array to largest and smallest
        int smallest = numbers[0];
        int largetst = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largetst)
                largetst = numbers[i];
            else if (numbers[i] < smallest)
                smallest = numbers[i];
        }

        System.out.println("Largest Number is : " + largetst);
        System.out.println("Smallest Number is : " + smallest);
    }

    public static int[] findMinMaxInArray(int array[]) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        int result[] = new int[2];
        result[0] = min;
        result[1] = max;
        return result;
    }

    public static int[] findMinMaxInArrayUsingJava8(int array[]) {
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        int result[] = new int[2];
        result[0] = min;
        result[1] = max;
        return result;
    }
}