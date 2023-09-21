package org.example.algorithmn;

import java.util.HashMap;

import pojo.Employee;

public class FindDuplicateChar {
//static int i=0;
	
	public static void main(String str[])
	{
		//Character array[]= {'a','a','b','v','v','v','s','s','a','e','y','y'};
		
	String array[]= {"hello","sudhir","mahesh","hello","sudhir","market","market","hello","ntpc","ntpc","market","sudhir"};

		Employee emp=new Employee("sudhir", 40);
		
		Employee emp1=new Employee("sudhir", 40);
		Employee em=new Employee("mahesh", 30);
		Employee e=new Employee("mahesh", 30);
		Employee e1=new Employee("mahesh2", 30);
		Employee e2=new Employee("mahesh", 30);
		Employee e3=new Employee("mahesh", 30);
		Employee array2[]= {emp1,em,e,e1,e2,e2,e2,e3};

		System.out.println("duplicate is"+array.toString());
	//HashMap<Character,Integer>	 map=getDuplicate(array);
	
HashMap<Employee,Integer>	 map=getDuplicateObject(array2);
	System.out.println("after remove dupliacte is"+map);
	}
	
	
	
	public static HashMap<Employee,Integer> getDuplicateObject(Employee arr[])
	{

		HashMap<Employee,Integer> dup=new HashMap<Employee,Integer>();
		
		for(Employee c:arr)
		{
			int i=1;
			if(dup.containsKey(c))
			{
				System.out.println("contains key :"+dup.containsKey(c)+":::c is:;;"+c);
			i=dup.get(c);
			
			//System.out.println("dup.get(c)::"+dup.get(c)+"c is::"+c);
			
				dup.put(c,++i);
			}else
			{
				dup.put(c,1);
			}
		}
		//System.out.println("duplicate is::"+dup);
		return dup;
	}
	
	
	
	
	public static HashMap<String,Integer> getDuplicateWords(String arr[])
	{

		HashMap<String,Integer> dup=new HashMap<String,Integer>();
		
		for(String c:arr)
		{
			int i=1;
			if(dup.containsKey(c))
			{
				System.out.println("contains key :"+dup.containsKey(c)+":::c is:;;"+c);
			i=dup.get(c);
			
			//System.out.println("dup.get(c)::"+dup.get(c)+"c is::"+c);
			
				dup.put(c,++i);
			}else
			{
				dup.put(c,1);
			}
		}
		//System.out.println("duplicate is::"+dup);
		return dup;
	}
public static HashMap<Character,Integer> getDuplicate(Character arr[])
{

	HashMap<Character,Integer> dup=new HashMap<Character,Integer>();
	
	for(char c:arr)
	{
		int i=1;
		if(dup.containsKey(c))
		{
		i=dup.get(c);
		
		System.out.println("dup.get(c)::"+dup.get(c)+"c is::"+c);
		
			dup.put(c,++i);
		}else
		{
			dup.put(c,1);
		}
	}
	//System.out.println("duplicate is::"+dup);
	return dup;
}

private char[] getCharArray(char[] array) {
    String _array = "";
    for(int i = 0; i < array.length; i++) {
        if(_array.indexOf(array[i]) == -1) // check if a char already exist, if not exist then return -1
            _array = _array+array[i];      // add new char
    }
    return _array.toCharArray();
}
}
