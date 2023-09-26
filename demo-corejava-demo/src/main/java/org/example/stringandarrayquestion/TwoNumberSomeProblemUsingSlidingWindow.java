package org.example.stringandarrayquestion;

import java.util.Arrays;
import java.util.HashMap;

public class TwoNumberSomeProblemUsingSlidingWindow {
    public static void main(String str[]) {
        //Given an array of integers, return the indices of the two numbers whose sum is equal to a given target.
        int nums[] = {2, 7, 11, 15};
              int   target = 9;

     int  indices[]=   twoNumberSumEqualToTarget(nums,target);
     System.out.println("indices is::"+ Arrays.toString(indices));

     int indeces2[]=twoSomeProblemUsingBruteForce(nums,target);
        System.out.println("indices is: using naive approach:"+ Arrays.toString(indeces2));
        int indeces3[]= usingAnotherWayTwoSumProblem(nums,target);
        System.out.println("indices is: using aonther approach:"+ Arrays.toString(indeces3));

    }

    public static int[] twoNumberSumEqualToTarget(int array[], int target) {

        // Time complexity: O(n)
      //1-  Initialize an empty HashMap.
        // 2-Iterate over the elements of the array.
        //3-calculate the remaining like remaining=target-array[i]  and check in the hashmap that remaining exist as key or not
        //4-if exist then return new int[]{hashmap.get(remaining),i} otherwise put in the hashmap like hashmap.put(remaining,i);

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int remaining = target - array[i];
            if (hashMap.containsKey(remaining)) {
                return new int[]{hashMap.get(remaining), i};
            } else {
                hashMap.put(array[i], i);
            }
        }
        return new int[]{};
    }
    public static int[] twoSomeProblemUsingBruteForce(int array[],int target)
    {
        // Time complexity: O(n^2)

        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]+array[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static int[] usingAnotherWayTwoSumProblem(int array[],int target)
    {
        //    // Time complexity: O(n*log(n))
        Arrays.sort(array);
        int right=array.length-1;
        int left=0;
        while(left<right)
        {
            if(array[left]+array[right]==target)
            {
                return new int[]{array[left], array[right]};
            }else if(array[left]+array[right]<target)
            {
                left++;
            }else {
                right--;
            }
        }
        return new int[]{};
    }
}
