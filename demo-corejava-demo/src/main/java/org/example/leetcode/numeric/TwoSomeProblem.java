package org.example.leetcode.numeric;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSomeProblem {
    public static void main(String str[])
    {
        /*
        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
         */

       int [] nums = {2,7,11,15};
               int target = 9;
        int [] num = {3,2,4};
                int target1 = 6;

        int [] output= twoSome(num,target1);
       System.out.println(Arrays.toString(output));

        int [] output2=twoSomeInBigN(num,target1);
        System.out.println(Arrays.toString(output2));

    }
    public static int[] twoSome(int [] nums,int target)
    {
        //    // Time complexity: O(n2)
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1 ;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] twoSomeInBigN(int [] nums,int target)
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int secondNumber=target-nums[i];
            if(map.containsKey(secondNumber))
            {
                return  new int []{map.get(secondNumber),i};
            }else {
                map.put(nums[i], i);

            }
        }
        return new int[]{};
    }

}
