package org.example.javabasic;

public class annyomousarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(new int[] {8,9,6,5});//annonymous array
	}
public static void sum(int[] x)
{
	int total=0;
	for(int y:x)
	{
		total=total+y;
	}
	System.out.println(total);
}
}
