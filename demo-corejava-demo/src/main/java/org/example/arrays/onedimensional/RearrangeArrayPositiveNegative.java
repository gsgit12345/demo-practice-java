package org.example.arrays.onedimensional;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RearrangeArrayPositiveNegative {

    public static void main(String str[])
    {
       // Input :
        //arr[] = {-2, 3, 4, -1}
       // Output :
        //arr[] = {-2, 3, -1, 4} OR {-1, 3, -2, 4} OR ..

        //Input :
        //arr[] = {-2, 3, 1}
        //Output :
        //arr[] = {-2, 3, 1} OR {-2, 1, 3}

        //Input :
        //arr[] = {-5, 3, 4, 5, -6, -2, 8, 9, -1, -4}
        //Output :
        //arr[] = {-5, 3, -2, 5, -6, 4, -4, 9, -1, 8}
        int arr[] = { 2, 3, -4, -1, 6, -9 };
        int array[]={4, 2, -3, 1, 6};
        int subarrayfail[] = { -3, 2, 3, 1, 6 };

        // rearangeArrayWithoutOrder(arr);
    boolean result=    subArrayWithZeroSum(subarrayfail);
    if(result) {
        System.out.println("subarrayExist with zero"+result);
    }else {
        System.out.println("subarrayNotExist with zero"+result);
    }
    }

    public static void rearangeArrayWithoutOrder(int array[])
    {
        //Order of elements in output doesn’t matter. Extra positive or negative elements should be moved to end.

        //1-function will take input as array[] and declare two variable i and j.initialize i with 0 and initialize j with array.length-1
        //2-start shifting all negative value to the end
        //3-take while loop and execute it till end of the array like while(i<j) here j=array.length-1
        //4-take inner while loop and execute from start to end.i<array.length-1 and check the condition in loop that array[i]>0 or not.increment the i.combine
        //both condition using && operator like while(i<array.length-1 && array[i]>0)
        //5-again take a while loop and start from j or array.length-1 and check j>=0  and put one condition that array[j]<0 should  be and combine both condition using
        //&& operator and decrease j with 1 like j--; like while(j>=0 && array[j]<0.
        //6-check if i<j then swap the array value swap(array,i,j) and end the loop .shifting all negative value to the right is completed.come out from loop
        //7-if i has index of leftmost  negative element then return like if(i==0 || i==n) return ;
        //8-now rearrange the positive and negative value in array .take a K as variable and assign with 0.
        //9-take a while loop  like while(k<n && i<n)  and call the swap(array,k,i)
        //10-increment the i=i+1 and k=k+2 and close the loop

        int n=array.length;
        int i=0;
        int j=n-1;
        while(i<j)
        {
            while(i<=n-1 && array[i]>0)
                i++;
            while(j>=0 && array[j]<0)
                j--;
            if(i<j)
                swap(array,i,j);
        }
        if(i==0||i==n)
            return ;
        System.out.println(""+Arrays.toString(array)+"i::"+i);
        //rearrange the array in alternate way
        int k=0;
        while(k<n && i<n)
        {
            swap(array,k,i);
            i=i+1;
            k=k+2;
        }
System.out.println(Arrays.toString(array));
        // output -1 3 -4 2 -9 6
        //Time Complexity : O(N)
        //Space Complexity : O(1)
    }
    public static void swap(int array[],int i,int j)
    {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public static boolean subArrayWithZeroSum(int array[])
    {
     //   Given an array of positive and negative numbers, the task is to find if there is a subarray (of size at least one) with 0 sum.
       // Input: {4, 2, -3, 1, 6}
        //Output: true
        //Explanation:
        //There is a subarray with zero sum from index 1 to 3.
        //Input: {4, 2, 0, 1, 6}
        //Output: true
        //Explanation: The third element is zero. A single element is also a sub-array.

       // Input: {-3, 2, 3, 1, 6}
        //Output: false
//step to be followd
        //1-take a variable sum and assign it with 0
        //2-traverse the from 0 to n and assign the array element in sum variable like sum=array[i];
        //3-put if condition and check the  sum is equal to zero or not.if it is equal to zero return true
        //4-take again one loop starting from j=i+1 and run till end of the array.this loop would be in main loop
        //5-again sum all element and store it in sum variable.put the if condition and check it is equal to zero.if yes then return true;
        //close the loop and from function return false;

        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum=array[i];
            if(sum==0)
                return true;
            for(int j=i+1;j<array.length;j++)
            {
                sum=sum+array[j];
                if(sum==0)
                    return true;
            }
        }
        //Time Complexity: O(N2)
        //Auxiliary Space: O(1)
return false;
    }
    public static boolean subArrayExistWithSingleLoop(int array[])
    {
        //https://www.geeksforgeeks.org/find-if-there-is-a-subarray-with-0-sum/
        Set<Integer> set = new HashSet<>();
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum=sum+array[i];
            if(sum==0||array[i]==0||set.contains(sum))
                return true;

            set.add(sum);
        }
        //Time Complexity: O(N)
        //Auxiliary Space: O(n)


        return false;
    }
}
