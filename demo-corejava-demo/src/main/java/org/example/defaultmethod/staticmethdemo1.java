package org.example.defaultmethod;


interface intdemo
{
	static void hello(int a)
	{
		System.out.println("hello:"+a);
	}
}
interface intdemo2 extends intdemo
{
	static void hello(int a)
	{
		System.out.println("hello java :"+a);
	}
}
public class staticmethdemo1  implements intdemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		intdemo.hello(10);
		intdemo2.hello(20);
		
		staticmethdemo1  hh=new staticmethdemo1();// interface's static method is not visible in the subclass
		
		
		
	}

}
