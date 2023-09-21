package org.example.polymorphism.methodoverloading;

public class OverloadedMethod4 {

	public void test(Integer in)
	{
		System.out.println("integer version");
	}
	public void test(char[] in)
	{
		System.out.println("char version");
	}
	public void test(Object in)
	{
		System.out.println("Object version");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadedMethod4 jk=new OverloadedMethod4();
		//jk.test(null);//integer and char[] both falls at same level to object but different hierarchy
	}

}
