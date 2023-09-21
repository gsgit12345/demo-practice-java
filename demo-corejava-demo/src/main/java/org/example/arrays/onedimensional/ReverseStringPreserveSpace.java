package org.example.arrays.onedimensional;

public class ReverseStringPreserveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String hel="how are you";
		System.out.println(reverseStringWithSpace(hel));

	}
public static String reverseStringWithSpace(String str)
{
	
	char input[]=str.toCharArray();
	
	char result[]=new char[input.length];
	int j=input.length-1;
	for(int i=0;i<input.length;i++)
	{
		if(input[i]==' ')
		{
			result[i]=' ';
		}
	}
	
	
	for(int i=0;i<input.length;i++)
	{
		if(input[i]!=' ')
		{
			if(result[j]==' ')
				j--;
			result[j]=input[i];
			j--;
		}
	}
	return String.valueOf(result);
}
}
