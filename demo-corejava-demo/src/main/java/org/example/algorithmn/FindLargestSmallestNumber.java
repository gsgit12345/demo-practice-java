package org.example.algorithmn;

import java.util.*;
import java.util.stream.Stream;

public class FindLargestSmallestNumber {

    public static void main(String[] args) {

        //numbers array
        int numbers[] = new int[]{55, 32, 45, 98, 82, 11, 9, 39, 50};
        List<Integer> numbers2 = Arrays.asList(-10, 3, -2, 8, 7);
        int absMin = numbers2.stream()
                .min(Comparator.comparingInt(Math::abs))
                .orElseThrow(NoSuchElementException::new);


        Arrays.stream(numbers).max();
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);

        Integer var = list.stream().max(Integer::compare).get();
System.out.println("max is:;"+var);
        List<String> list2 = Arrays.asList("G", "E", "E", "K",
                "g", "e", "e", "k");

        // using Stream.max() method with Comparator
        // Here, the character with maximum ASCII value
        // is stored in variable MAX
        String MAX = list2.stream().max(Comparator.
                comparing(String::valueOf)).get();

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