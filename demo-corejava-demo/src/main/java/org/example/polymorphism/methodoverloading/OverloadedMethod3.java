package org.example.polymorphism.methodoverloading;

public class OverloadedMethod3 {

	public void test(int[] te) {
		System.out.println("string and object");
	}

	public void test(char[] arr) {
		System.out.println("object and str");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadedMethod3 ob = new OverloadedMethod3();
	//	ob.test(null);//more specific method is not resolved and falls in the same hierarchy
	}
}