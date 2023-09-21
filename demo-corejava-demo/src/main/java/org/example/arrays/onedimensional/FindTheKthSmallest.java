package executerdemo.practice;

import java.util.HashMap;

public class FindTheKthSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7, 10, 4, 3, 20, 15} ;
		
		
		HashMap m=new HashMap();
		
	////Object mm=	m.put("hello", "hello");
	
//	System.out.println(mm.toString());
	System.out.println(	"kth "+findKthSmallestinarray(arr,2));
		
		
		mergeSort(arr,0,arr.length);
		
		for(int a:arr)
		{
			System.out.println("array::"+a);
		}

	}

	
	public static int findKthSmallestinarray(int array[],int k)
	{
		mergeSort(array,0,array.length-1);
		return array[k-1];
		
	}
	public static void mergeSort(int arr[],int low,int high)
	{

		
		
		if(low<high)
		{
			int mid=(low+high)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			merge(arr);
		}
	}



	private static  void merge(int[] arr) {
		
		
		if(arr.length>1)
		{
			int mid=arr.length/2;
		int arr1[]=new int[mid];
		int arr2[]=new int[arr.length-mid];
		for(int i=0;i<mid;i++)
			arr1[i]=arr[i];
		
		for(int j=mid;j<arr.length;j++)
			arr2[j-mid]=arr[j];
		
		merge(arr1);
		merge(arr2);
		
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<=arr2[j])
			{
				arr[k]=arr1[i];
				i++;
			}else
			{
				arr[k]=arr2[j];
				j++;
			}
			k++;
		}
		
		
		while(i<arr1.length)
		{
			arr[k]=arr1[i];
			i++;
			k++;
		}

		while(j<arr2.length)
		{
			arr[k]=arr2[j];
			j++;
			k++;
		}
	}
	}
}
