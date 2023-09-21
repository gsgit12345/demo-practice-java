package executerdemo;

class book
{
	static
	{
		System.out.println("hello static");
	}
	
	{
		System.out.println("hello non static");
	}
	
	book()
	{
		System.out.println("book");
	}
}


public class student extends book
{
public static void main(String str[])
{
	student ss=new student();
}
}
