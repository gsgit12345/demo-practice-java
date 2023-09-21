package org.example.micell;



public class Overloaded7Method {

	public void test(char ... in)
	{
		System.out.println("char version");
	}
	public void test(int in)
	{
		System.out.println("int version");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloaded7Method kl=new Overloaded7Method();
		kl.test(8);//widening rule applicable
		kl.test('a');
	}
}
