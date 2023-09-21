package innerclass;

class parent
{
	public String  var="heloo";
	public int hello()
	{
		System.out.println("hello parent");
		return 0;
	}
	
	public static int demo()
	{
		System.out.println("hello parent static");
		return 0;
	}
}
class child extends parent
{
	public String  var="heloo ch";
	public int hello()
	{
		System.out.println("hello child");
		return 0;
	}	
	public static int demo()
	{
		System.out.println("hello child static");
		return 0;
	}
}

public class MethodOveride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
parent p=new child();
System.out.println(p.hello());
System.out.println(p.demo());
System.out.println(p.var);

	}

}
