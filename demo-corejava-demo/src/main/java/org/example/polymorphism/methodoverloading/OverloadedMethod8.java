package org.example.polymorphism.methodoverloading;

public class OverloadedMethod8 {
public void test(Integer it)
{
	System.out.println("hello integer");
}
public void test(Long it)
{
	System.out.println("hello long");
}
public void test(Object it)
{
	System.out.println("hello object");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadedMethod8 hj=new OverloadedMethod8();
		short s=8;
		hj.test(5);//first widenging and then boxing
		hj.test(s);//
	}

}
