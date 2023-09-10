package org.example.arrays.onedimensional;

public class LargestSumContigousSubArray {
    public static void main(String str[]) {
        int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};
        int max = largestSumContigousSubArrayWithPositiveAndNegativeNumber(array);
        System.out.println("max subarray::" + max);
        int result = largestSumContigousSubArrayWithPositiveAndNegativeNumberNaiveApproach(array);
        System.out.println("result:" + result);
    }

    public static int largestSumContigousSubArrayWithPositiveAndNegativeNumber(int array[]) {
        //this will not work for array which contains all number negative in array
        //it will work mix of positive and negative number.
        //step to be followed
        //  Initialize:
        // max = 0
        // max_here = 0
        //Loop for each element of the array
        //  (a) max_here = max_here + a[i]
        // (b) if(max < max_here)
        //max = max_here
        //      (c) if(max_here < 0)
        //max_here = 0
        // return max

        int max = 0;
        int max_here = 0;
        for (int i = 0; i < array.length; i++) {
            max_here = max_here + array[i];
            if (max < max_here) {
                max = max_here;
            }
            if (max_here < 0) {
                max_here = 0;
            }
        }
        return max;

    }

    public static int largestSumContigousSubArrayWithPositiveAndNegativeNumberNaiveApproach(int array[]) {
        int maxSum = 0;
        int i = 0;
        int n = array.length;
        for (; i <= n - 1; i++) {
            int currSum = 0;
            for (int j=i; j <= n - 1; j++) {
                currSum += array[j];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }

        }
        return maxSum;
    }

}
