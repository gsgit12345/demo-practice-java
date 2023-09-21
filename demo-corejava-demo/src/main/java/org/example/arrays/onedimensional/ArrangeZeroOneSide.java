package executerdemo.practice.arrayques;

import java.util.Arrays;

public class ArrangeZeroOneSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,4,6,0,9,0,2,0};
		
		int arr2[]=arrangeZeroOneSide(arr);
		System.out.println(Arrays.toString(arr2));

	}

	
	public static int [] arrangeZeroOneSide(int array[])
	{
		int j=0;
		
		for(int i=0;i<array.length;i++)
		{
		
			if(array[i]!=0)
			{
			array[j++]=array[i];
			}
		}
			while(j<array.length)
				array[j++]=0;
		
			
		return array;
	}
	
	

	
	public static int [] arrangeZeroToTheStart(int array[])
	{
		int j=array.length-1;
		
		for(int i=array.length-1;i>=0;i--)
		{
			if(array[i]!=0)
			{
			array[j]=array[i];
			j--;
			}
			
		}

		while(j>=0)
		{
			array[j]=0;
			j--;
		}
		return array;
	}

}
