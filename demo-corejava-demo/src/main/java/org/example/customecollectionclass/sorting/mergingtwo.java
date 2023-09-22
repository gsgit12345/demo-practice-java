package org.example.customecollectionclass.sorting;

import java.util.Arrays;

public class mergingtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] ={2,1,3,4,6,11,34};
		int array2[] ={22,12,32,42,64,10,66,89,33,77};
		
		int low=0;
		int high=array2.length-1;
	//int third[]=	mergeTwoArray(array,array2);
mergeSort(array2,high);
	
	for(int i:array2)
	{
		System.out.println(i);
	}
	}
	
	
	
 public static int[] mergeSort(int [] arr, int len){
	      
	      if (len < 2){return null;}

	      int mid = len / 2;
	      int [] left_arr = new int[mid];
	      int [] right_arr = new int[len-mid];
	      

	      
	    //Dividing array into two and copying into two separate arrays
	      int k = 0;
	      for(int i = 0;i<len;++i){
	          if(i<mid){
	              left_arr[i] = arr[i];
	              return left_arr;
	          }
	          else{
	              right_arr[k] = arr[i];
	              k = k+1;
	              return right_arr;
	          }
	      }
	   
	      return null;
	  }
	  



		
public static int[] mergeTwoArray(int arr[],int []array2)
{
	
	int thirdArray[]=new int[arr.length+array2.length];
	
	int i=0;
	int j=0;
	int k=0;
	//Arrays.sort(arr);
	//Arrays.sort(array2);
	while(i<arr.length && j<array2.length)
	{
		if(arr[i]<array2[j])
		{
			thirdArray[k]=arr[i];
			i++;
			k++;
		}else
		{
			thirdArray[k]=array2[j];
			j++;
			k++;
		}
		
		
		
	}
	
	while(i<arr.length)
	{
		thirdArray[k]=arr[i];
		i++;
		k++;
	}
	
	while(j<array2.length)
	{
		thirdArray[k]=array2[j];
		j++;
		k++;
	}	
		
		
	
	return thirdArray;
}

}