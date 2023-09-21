package org.example.arrays.onedimensional;

public class SubArrayWithGivenSum {
    public static void main(String str[]) {
        //problem statement
        // Given an array arr[] of non-negative integers and an integer sum, find a subarray that adds to a given sum.
//Note: There may be more than one subarray with sum as the given sum, print first such subarray.
        //Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
        //Output: Sum found between indexes 2 and 4
        //Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33

        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};

        // int sum=37;
        int sum = 23;
        // findSubArraySum(arr,sum);
        findSumInAnotherWay(arr, sum);
    }

    public static int findSubArraySum(int array[], int sum) {
        int len = array.length;
        int currentSum = array[0];
        int start = 0;
        int i;
        for (i = 1; i <= len; i++) {
            while (currentSum > sum && start < i - 1) {
                currentSum = currentSum - array[start];
                start++;
            }
            if (currentSum == sum) {
                int p = i - 1;
                System.out.println(
                        "Sum found between indexes " + start
                                + " and " + p);
                //if you want to remove all indices ,then remove return statement.
                return 1;
            }
            if (i < len) {
                currentSum = currentSum + array[i];
            }
        }
        System.out.println("no subarray found");
        return 0;
    }

    public static int findSumInAnotherWay(int array[], int sum) {
        int len = array.length;

        for (int i = 0; i < len; i++) {
            int currentSum = array[i];

            if (currentSum == sum) {
                System.out.println("Sum found at indexe "
                        + i);
                return 0;
            } else {
                // Try all subarrays starting with 'i'
                for (int j = i + 1; j < len; j++) {
                    currentSum = currentSum + array[j];

                    if (currentSum == sum) {
                        System.out.println(
                                "Sum found between indexes " + i
                                        + " and " + j);
                        return 0;
                    }
                }
            }
        }
        System.out.println("No subarray found");
        return 0;

    }
}
