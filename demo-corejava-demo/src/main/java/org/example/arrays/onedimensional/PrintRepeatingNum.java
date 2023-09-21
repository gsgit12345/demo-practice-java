package org.example.arrays.onedimensional;
//big(n) time
public class PrintRepeatingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = { 1, 2, 3, 1, 3, 6, 6,8,8,9,9};
        
        printDuplicateInBigOn(arr);
	}

	
	
	public static void printDuplicateInBigOn(int array[])
	{
		int size=array.length;
		
		for(int i=0;i<size;i++)
		{
			int j=Math.abs(array[i]);
			if(array[j]>=0)
			{
				array[j]=-array[j];
			}
			else
				System.out.println("j is::"+j);
		}
	}
}
