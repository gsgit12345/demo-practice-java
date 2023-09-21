package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*Given an array of n elements that contains elements from 0 to n-1,
 *  with any of these numbers appearing any number of times. 
 * Find these repeating numbers in O(n) and using only constant memory space.
 */


public class FindDuplicatinarraywithconst {

	public static void main(String[] args) {
		
		
		
		//int array[]= {1,1,0,0,2,2,2,11,11,2,3,3,4,8};
		//int array[]={1, 2, 3,4,4, 6, 3,8, 6, 1,7,7};
		Integer array[]={1, 2, 3,4,4, 6, 3,8, 6, 1,7,7};
		//Input : n = 7 and array[] = {1, 2,4,4, 3, 6}

		
		removeDuplicatein8(array);
	
	for(int a:array)
	{
		//System.out.println(a);
	}
	}
public static int [] findDuplicateInconstanttime(int array[])
{
	
	for(int i=0;i<array.length;i++)
	{
		int j=Math.abs(array[i]);
		if(array[j]>=0)
		{
			array[j] = -array[j];
		}
		else
		{
			System.out.println(j);
		}
	}
	
	
	return array;
}


public static  void  removedupliacte(int arr[])
{
	HashSet<Integer>  set=new HashSet<>();
	for(int i=0;i<arr.length;i++)
	{
		if(set.add(arr[i])==false)
		{
			System.out.println(arr[i]);
		}
	}
}

public static void removeDuplicatein8(Integer arr[])
{
	
List arr2=Arrays.asList(arr);

List <Integer>dist=(List<Integer>) arr2.stream().distinct().collect(Collectors.toList());


dist.forEach(System.out::println);
	
	
}

}
