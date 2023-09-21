package practice.arrayques;

import java.util.Arrays;

public class RotateByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]= {2,3,4,1,8};
		
		int arr[]=rotateByOne2(array);
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static int[] rotateByOne(int array[])
	{
		int i=0;
		int j=array.length-1;
		while(i!=j)
		{
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			i++;
		}
		
		return array;
	}
	public static int[] rotateByOne2(int array[])
	{
		int last=array[array.length-1];
		
		for(int i=array.length-1;i>0;i--)
		{
			array[i]=array[i-1];
			array[0]=last;
			
		}
		
		return array;
	}
	

}
