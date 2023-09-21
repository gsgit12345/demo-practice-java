package org.example.arrays.onedimensional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int arr[]= {1,34,23,21,55,32,9,7,6};
		Integer arr[]= {1,34,23,21,55,32,9,7,6};;
		int num=linSearchJava8(arr,9);
		
		if(num==-1)
		{
			System.out.println("is not found");
		}
		else
		{
			System.out.println("found is::"+num);
		}
	}
	
	public static int linSearch(int arr[],int num)
	{
		int len=arr.length;
		boolean flag=false;
		for(int a:arr)
		{
			if(a==num)
			{
				return a;
			}
		}
		
		return -1;
	}
	
	public static int linSearchJava8(Integer arr[],int num)
	{
		
	List<Integer> list=	Arrays.asList(arr);
	
	Optional<Integer> num2=list.stream().filter(x->x==num).findAny();
	

	return 0;
	}

}
