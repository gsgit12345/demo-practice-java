package org.example.typicalquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromListInJava8 {
	
	public static void main(String str[])
	{
        List<Integer> list = new ArrayList<>(
                Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));

	}

	public static List<Integer> removeDuplicateFromListInJava8(List<Integer> list)
	{
		List<Integer> objList=list.stream().distinct().
				collect(Collectors.toList());
		return objList;
	}
	
	public static  List<Integer> removeDuplicate(List<Integer> list) 
	{
		ArrayList<Integer> arr=new ArrayList<>();
		for(Integer it:list)
		{
			if(!arr.contains(it))
			{
				arr.add(it);
			}
		}
		return arr;
	}
}
