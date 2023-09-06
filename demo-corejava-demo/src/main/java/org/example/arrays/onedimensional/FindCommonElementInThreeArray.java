package org.example.arrays.onedimensional;

public class FindCommonElementInThreeArray {
    public static void main(String str[])
    {
        int ar1[] = { 1, 5, 10, 20, 40, 80 };
        int ar2[] = { 6, 7, 20, 80, 100 };
        int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
      //  commonElementInThreeArray(ar1,ar2,ar3);
        int arr[] = { 10, 5, 3, 4, 3, 5, 6 };

        int index=   findFirstDuplicateNumberInArray(arr);

        if(index==-1) {
            System.out.println("first duplicate is not found");
        }else
        {
            System.out.println("first duplicate is  found:"+arr[index]);
        }

    }
    public static void commonElementInThreeArray(int array1[],int array2[],int array3[])
    {
        int i=0,j=0,k=0;
        while(i < array1.length && j <array2.length && k <array3.length)
        {
            if(array1[i]==array2[j] && array2[j]==array3[k])
            {
                System.out.println(array1[i]+" ");
                i++;
                j++;
                k++;
            }else if(array1[i]<array2[j])
            {
                i++;
            }else if(array2[j]<array3[k])
            {
                j++;
            }else
            {
                k++;
            }
        }
    }

    public static int findFirstDuplicateNumberInArray(int array[])
    {
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]==array[j])
                    return i;
            }
        }
        return -1;
    }
}
