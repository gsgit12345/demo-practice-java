package org.example.polymorphism.methodoverloading;

public class OverloadedMethod1 {
	public void test(String test)
	{
		System.out.println("string version");
	}
	/*public void test(Object test)
	{
		System.out.println("Object version");
	}*/
	public void test(StringBuffer test)
	{
		System.out.println("StringBuffer version");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		OverloadedMethod1 over1=new OverloadedMethod1();
	//	over1.test(null); //ambiguous method error

	}

}
