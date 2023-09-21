package org.example.polymorphism.methodoverloading;

public class OverloadedMethod5 {
	public void test(Integer in)
	{
		System.out.println("integer version");
	}
	public void test(long in)
	{
		System.out.println("long version");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadedMethod5 lk=new OverloadedMethod5();
		
		lk.test(6);//long here is widening 
		lk.test(null);//integer here is integer call because object 
	}

}
