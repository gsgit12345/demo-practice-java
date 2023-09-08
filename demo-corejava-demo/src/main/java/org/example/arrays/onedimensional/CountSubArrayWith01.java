package org.example.arrays.onedimensional;

import java.util.HashMap;
import java.util.Map;

public class CountSubArrayWith01 {
    public static void main(String str[])
    {
      //  Input: arr[] = {1, 0, 0, 1, 0, 1, 1}
       // Output: 8
        //Explanation: The index range for the 8 sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4), (4, 5)(2, 5), (0, 5), (1, 6)

        //Input: arr = { 1, 0, 0, 1, 1, 0, 0, 1}
        //Output: 12
      int   arr[] = {1, 0, 0, 1, 0, 1, 1};
     int count=   countSubarrWithEqualZeroAndOne(arr);
     System.out.println("count is::"+count);

    }

    public static int countSubarrWithEqualZeroAndOne(int array[])
    {
      //  Count subarrays with equal number of 1’s and 0’s using Frequency Counting:

//Given an array arr[] of size n containing 0 and 1 only. The problem is to count the subarrays having an equal number of 0’s and 1’s.

        //steps
    //1-take the length of array in a variable like n
    //2-create two variable sum and count and initialize with zero,create HashMap of Integer as key and value both
    //3-run the loop from i=0 to the N
    //4-check the condition that array containes the 0 if yes ,then initialize array[i] with -1 value
    //5-sum the array element and store it in sum variable
    //6-check the that sum is equal to 0 if yes then increment the count++
    //7-check in the map that sum is available in the map as key (containsKey())if yes then get from the hashmap and add in the count like count=count+hashmap.get(sum)
    //8-then again check in hashmap that sum is available as key if yes then put in hashmap sum as key and value as hashmap.get(sum)+1
    //9-in else part put in the map as hashmap.put(sum,1);
    //10-at last outside of loop,return the count from function.from line num 4 to the 9 would be within loop

int n=array.length;
int sum=0;
int count=0;
        Map<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(array[i]==0)
                array[i]=-1;
            sum=sum+array[i];

            if(sum==0)
                count++;
            if(hashMap.containsKey(sum))
                count=count+hashMap.get(sum);
            if(hashMap.containsKey(sum))
                hashMap.put(sum,hashMap.get(sum)+1);
            else
                hashMap.put(sum,1);

        }
        return count;


}
}