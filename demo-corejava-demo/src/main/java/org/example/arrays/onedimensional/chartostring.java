package org.example.arrays.onedimensional;

public class chartostring {

	
	
	public static void main(String str[])
	{
		
		System.out.println(getIntValue("-453235"));
	}
	
	
	public static  int  getIntValue(String s)
	{
		int length=s.length();
		 int zeroaci=(int)'0';
		 System.out.println(zeroaci);
		int num=0;
		boolean isnegative=false;
		int i=0;
		if(s.charAt(0)=='-')
		{
			i=1;
			isnegative=true;
		}
			
		while(i<length)
		{
			num=num *10 +((int)s.charAt(i)-zeroaci);
			i++;
			
		}
		
		if(isnegative)
		{
			num=0-num;
		}
		return num;
	}
}
