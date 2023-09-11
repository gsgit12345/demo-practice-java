package org.example.arrays.onedimensional;

import java.util.HashSet;

public class FindAllTripLetWithGivenSum {
    public static void main(String str[])
    {
      int[]  nums = { 0,1,1,3,4,6,7 };
        int A[] = { 1, 4, 45, 6, 10, 8 };
      int sum=15;
 //boolean find=       findTripletWithGivenSum(nums,sum);
 //System.out.println("find the triplet::"+find);
       // findTripletInsortedArray(A,sum);

//below is for unsorted array
        findTRipletUsingHashing(A,sum);
    }
    public static boolean findTripletWithGivenSum(int array[],int sum)
    {
        //time complexity:-big(n3)
        //space big(1)
        boolean b=false;
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                for(int k=j+1;k<array.length;k++)
                {
                    if(array[i]+array[j]+array[k]==sum)
                    {
                        System.out.println("triplet is found ("+array[i]+":at index:"+array[j]+":at index:"+array[k]+")");
                       b=true;
                       break;
                    }
                }
            }
        }
        return b;
    }
    public static void findTripletInsortedArray(int array[],int sum)
    {
        //time complexity:-big(n2)
        //space big(1)
        //array should be sorted
        int length=array.length;
        for(int i=0;i<length;i++)
        {
            int k = sum - array[i];
            System.out.print(","+k);
            int low=i+1;
            int high=array.length-1;
            while(low<high)
            {
                if(array[low]+array[high]<k)
                {
                    low++;
                } else if (array[low]+array[high]>k) {
                    high--;
                }
                else
                {
                    System.out.println("(" + array[i] + " " + array[low] + " " + array[high] + ")");
                    low++;
                    high--;
                }
            }

        }
    }
    public static boolean findTRipletUsingHashing(int array[],int sum)
    {
        //1-Traverse the array from start to end. (loop counter i)
       //2- Create a HashMap or set to store unique pairs.
         //3-   Run another loop from i+1 to end of the array. (loop counter j)
      //4-  If there is an element in the set which is equal to x- arr[i] – arr[j], then print the triplet (arr[i], arr[j], x-arr[i]-arr[j]) and break
         //5-   Insert the jth element in the set.

        int arr_size=array.length;
//for unsorted array
        for (int i = 0; i < arr_size ; i++) {

            // Find pair in subarray A[i+1..n-1]
            // with sum equal to sum - A[i]
            HashSet<Integer> s = new HashSet<Integer>();
            int curr_sum = sum - array[i];
            System.out.println("currentsum::"+curr_sum);
            for (int j = i + 1; j < arr_size; j++)
            {
                if (s.contains(curr_sum - array[j]))
                {
                    System.out.print("Triplet is " + array[i] + ", " + array[j] + ", " + (curr_sum - array[j]));
                    return true;
                }
                s.add(array[j]);
            }
        }
return false;
    }
    public static void findTripletWhoseSumIsZero(int arra,int zerosum)
    {

    }
}
