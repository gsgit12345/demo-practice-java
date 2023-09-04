package org.example.arrays.onedimensional;

import org.springframework.web.servlet.mvc.method.annotation.HttpEntityMethodProcessor;

import java.util.Arrays;

public class DutchNationalFlagProbandThreewayPartion {
    public static void main(String str[])
    {
        int array[]={0,0,1,1,1,1,0,0,2,2,0,1,0};
        int array2[]={0,0,1,1,1,1,0,0,0,1,0};
//sort the array
       // sorted array::[0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
       // DNFAndThreeWayPartion(array);
        //sort0and1(array2);

    }
    public static void sort0and1(int array[])
    {
        int zerospos=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==1)
            {
                continue;
            }else
            {
                array[i]=1;
                array[zerospos++]=0;

            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void DNFAndThreeWayPartion(int array[])
    {
        int start=0;
        int mid=0;
        int end=array.length-1;
        int pivot=1;

        while(mid<=end)
        {
            if(array[mid]<pivot) //if current element is 1
            {
                swap(array,start,mid);
                start++;
                mid++;
            }else if(array[mid]>pivot) //for if current element is 2
            {
                swap(array,mid,end);
                end--;

            }else {
                mid++;
            }
        }
       System.out.println("sorted array::"+Arrays.toString(array));
    }
    public static void swap(int array[],int i,int j)
    {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
