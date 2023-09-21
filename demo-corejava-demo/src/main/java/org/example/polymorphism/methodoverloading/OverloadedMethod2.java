package org.example.polymorphism.methodoverloading;

public class OverloadedMethod2 {

	public void test(String sr,Object te)
	{
		System.out.println("string and object");
	}
	public void test(Object sr,String te)
	{
		System.out.println("object and str");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadedMethod2 ob=new OverloadedMethod2();
		//ob.test(null, null);//more specific method is not resolved
	}

}
