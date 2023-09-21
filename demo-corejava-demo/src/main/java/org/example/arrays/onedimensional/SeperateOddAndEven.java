package org.example.arrays.onedimensional;

public class SeperateOddAndEven {

	public static void main(String[] args) {
        int arr[] = {12, 34, 45, 9, 8, 90, 3};

        int len=arr.length;
        
        seperateEvenOdd(arr,len); 
        
	}
public static void seperateEvenOdd(int array[],int len)
{
	int left=0;
	int right=len-1;
	
	while(left<right)
	{
		while(array[left]%2==0 && left<right)
		{
			left++;
		}
		
		while(array[right]%2==1 && left<right)
		{
			right--;
		}
		
		if(left<right)
		{
			int odd=array[left];
		
			array[left]=array[right];
			
			array[right]=odd;
			
			left++;
			right--;
		}
	}
	
	for(int i=0;i<array.length;i++)
	{
		System.out.print(array[i]+",");
	}
}
}
