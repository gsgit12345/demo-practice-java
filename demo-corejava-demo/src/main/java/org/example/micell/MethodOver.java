package misc;


class abc
{
	public int  aa=10;
	public void  say()
	{
	System.out.println("parent");	
	}
}

class az extends abc
{
	public int  aa=101;
	public void  say()
	{
		System.out.println("child");	
	}
}
public class MethodOver {

	public static void main(String[] args) {
		abc aa=new az();
		aa.say();
		System.out.println("main::"+aa.aa);

	}

}
