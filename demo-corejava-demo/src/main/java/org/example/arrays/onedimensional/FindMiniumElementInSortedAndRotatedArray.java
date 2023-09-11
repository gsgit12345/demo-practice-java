package org.example.arrays.onedimensional;

public class FindMiniumElementInSortedAndRotatedArray {
    public static void main(String str[])
    {
        //Find the Minimum element in a Sorted and Rotated Array
        int array[]={7,8,0,1,2,3,4,5,6}; //array is rotated
        usingLinearApproach(array);
        int low=0;
        int high=array.length-1;
      int value=  usingBinarsearch(array,low,high);
      System.out.println("value is::;"+value);
    }
    public static void usingLinearApproach(int array[])
    {
        int key=array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<key)
                key=array[i];
        }
        System.out.println("found minimum element:"+key);
    }
    public static int usingBinarsearch(int array[],int low,int high)
    {

        if (array[low] <= array[high]) {
            return array[low];
        }

        // Binary search
        while (low <= high) {
            int mid = (low + high) / 2;

            // Check if mid is the minimum element
            if (array[mid] < array[mid - 1]) {
                return array[mid];
            }
            // If the left half is sorted, the minimum
            // element must be in the right half
            if (array[mid] > array[high]) {
                low = mid + 1;
            }

            // If the right half is sorted, the minimum
            // element must be in the left half
            else {
                high = mid - 1;
            }
        }

        // If no minimum element is found, return -1
        return -1;


    }
}
