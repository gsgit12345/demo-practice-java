package org.example.arrays.onedimensional;

import java.util.Arrays;

public class FindFirstMissingPositiveNumber {
    public static void main(String str[]) {
        int array[] = {1, 2, 3, -9, 8, -6, 4, 6};
        int arr[] = {1,105, 101, 102,103, -10, -20};

        // int missing= findFirstMIssingPositiveNumber(arr);
        int k = 0 - 1;
        int n = arr.length;
        int missinggg = firstMissingPositive(arr, n);
        System.out.println("missinggg is:::" + missinggg);

       int sec= findMissingPositiveUsingSorting(arr,n);
        System.out.println("missing is:::" + sec);
        int missing2=findMIssingPositiveUsingThirdWay(arr);
        System.out.println("missing2 is:::" + missing2);
    }

    public static int alignNegativeInArray(int array[]) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j++;
            }

        }
        System.out.println(Arrays.toString(array));
        return j;
    }


    public static int firstMissingPositive(int arr[], int n) {
        //very easy than previous
        //   Time Complexity: O(N), Only two traversals are needed.
        //  Auxiliary Space: O(1), No extra space is needed


        // Check if 1 is present in array or not
        for (int i = 0; i < n; i++) {
            System.out.println("value::" + (arr[i] - 1));

            int element = arr[i];
            if (arr[i] > 0 && arr[i] <= n) {
                int position = element - 1;
                if (arr[position] != element) {
                    swap(arr[position], arr[element]);
                    i--;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(i+1!=arr[i])
                return i+1;
        }

        // If array has values from 1 to n
        return (n + 1);
    }
    public static void swap(int i,int j)
    {
        int temp=i;
        j=i;
        j=temp;
    }
public static int findMissingPositiveUsingSorting(int array[],int size)
{
 //   Time Complexity: O(N*log(N)), Time required to sort the array
   // Auxiliary Space: O(1)
    Arrays.sort(array);
    int ans=1;
    for(int i=0;i<size;i++)
    {
        if(array[i]==ans)
             ans++;
    }
    return ans;
}
    public static int findMIssingPositiveUsingThirdWay(int array[]) {

        int n=array.length;
        int N = array.length;
        boolean present[]=new boolean[N];
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            if(array[i]>0 && array[i]<=n)
            {
                System.out.println("::"+array[i]);
                present[array[i]] = true;
            }
            max=max<array[i]?array[i]:max;
        }
        System.out.println("present is::"+Arrays.toString(present));
        for(int i=1;i<n;i++)
        {
            if(!present[i])
            {
                System.out.println("i present is   ::"+i);
                return i;

            }
        }
        return n+1;
    }

}
