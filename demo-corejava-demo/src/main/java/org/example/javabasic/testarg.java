package org.example.javabasic;

public class testarg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//public static void m1(int... op)
	{
		System.out.println("hhhhhhhhhhh");
		//you can take the int array and int varargs parameter in two different method.method would be treated as one.
		//so it will give compile time error
	}
	public static void m1(int[] op)
	{
		System.out.println("hhhhhhhhhhh");
	}
}
