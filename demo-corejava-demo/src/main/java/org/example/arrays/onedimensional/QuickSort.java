package practice.arrayques;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {23,67,12,89,76,90,33,1,2,6,66};
		int low=0;
		int high=arr.length-1;
		QuickSort(arr,low,high);
		
		System.out.println(Arrays.toString(arr));

	}

	
	public static void QuickSort(int arr1[],int low,int high)
	{
		
		if(low<high)
		{
			int pivot=partion(arr1,low,high);
			QuickSort(arr1,low,pivot);
			QuickSort(arr1,pivot+1,high);
			
			
		}
	}
	
public static int partion(int arr[],int low,int high)
	{
		int pivot=arr[low];
		
		int i=low-1;
		int j=high+1;
		while(true)
		{
			do
			{
				i++;
				
			}while(arr[i]<pivot);
			
			do
			{
				j--;
			}while(arr[j]>pivot);
			
			if(i>=j)
				return j;
			
			
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			//swap(aray[i],aray[j]);
		}
		
	}
	
	public static void  swap(int i,int j)
	{
		int temp=i;
		i=j;
		j=temp;
	}
}
