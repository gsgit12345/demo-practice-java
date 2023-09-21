package org.example.defaultmethod;

public class DefaultImpl2  implements interface1,interface2 {

	@Override
	public  void hello()
	{
		System.out.println("hello in class");
		interface1.super.hello();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultImpl2 dd=new DefaultImpl2();
		dd.hello();
	}

}
