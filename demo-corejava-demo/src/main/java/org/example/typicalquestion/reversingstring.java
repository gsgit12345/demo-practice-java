package org.example.typicalquestion;

public class reversingstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String hello="hello java in demo";
		System.out.println(reverseString(hello));
	}
public static  String reverseString(String str)
{
	if(str==null||str.length()==0)
		return str;
	String reverse="";
	for(int i=str.length()-1;i>=0;i--)
	{
		reverse=reverse+str.charAt(i);
	}
	
	
	return reverse;
}
}
