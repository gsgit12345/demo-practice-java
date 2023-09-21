package misc;
class abcdf
{
	public void say(int i)
	{
		System.out.println("hello parent");
	}
}

class rty extends abcdf
{
	public void say(int i,int j)
	{
		System.out.println("hello child ");
	}
}
public class parenDemo {
public static void main(String str[])
{
	abcdf pp=new rty();
	pp.say(10);;
}
}
