package org.example.javabasic;

public class varargmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vararg();
		vararg(10,8);
	}
	
	public static void vararg(int... asd)
	{
		System.out.println("hello"+asd.length);
	}

	public static void vararg1(int...asd)
	{
		System.out.println("hello"+asd.length);
	}
	public static void vararg2(int   ...asd)
	{
		System.out.println("hello"+asd.length);
	}
	
	/*public static void vararg3(int.   ..asd)
	{
		System.out.println("hello"+asd.length);
	}
	public static void vararg4(int .asd..)
	{
		System.out.println("hello"+asd.length);
	}
	public static void vararg5(int asd...)
	{
		System.out.println("hello"+asd.length);
	}*/
	
	public static void m(double...ds ,int a)
	{
		
	}
	public static void m1(int y,double...ds )
	{
		
	}
	public static void m2(int... y,double...ds )
	{
		
	}
	
}
