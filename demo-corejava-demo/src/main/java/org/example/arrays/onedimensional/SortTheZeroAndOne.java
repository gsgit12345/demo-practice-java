package org.example.arrays.onedimensional;

public class SortTheZeroAndOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[]= {0, 1, 0, 1, 0, 0, 1, 1, 1, 0} ;
int len=array.length;
sortZroOne(array,len);

	}

	public static void sortZroOne(int array[],int n)
	{
		int zerocount=0;
		for(int i=0;i<n;i++)
		{
			if(array[i]==0)
			zerocount++;
		}
		
		for(int i=0;i<zerocount;i++)
		{
			array[i]=0;
		}
		
		for(int i=zerocount;i<n;i++)
		{
			array[i]=1;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+",");
		}
	}
}
