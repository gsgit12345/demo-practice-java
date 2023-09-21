package org.example.arrays.onedimensional;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckStrDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String st="12345d";
		System.out.println(checkDigitRegex(st));
	}
public static  boolean checkDigit(String str)
{
	boolean isDigit=false;
	
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)>='0'&&str.charAt(i)<='9')
		{
			isDigit=true;
		}else
		{
			isDigit=false;
		}
	}
	
	
	return isDigit;
}
public static  boolean checkDigitUsingInBuilt(String str)
{
	boolean isDigit=false;
	
	for(int i=0;i<str.length();i++)
	{
		if(Character.isDigit(str.charAt(i)))
		{
			isDigit=true;
		}else
		{
			isDigit=false;
		}
	}
	
	
	return isDigit;
}

public static  boolean checkDigitRegex(String str)
{
	boolean isDigit=false;
	
	String pt="[0-9]+";
	
	Pattern pp=Pattern.compile(pt);
	Matcher mm=pp.matcher(str);
	
	
	return mm.matches();
}
}
