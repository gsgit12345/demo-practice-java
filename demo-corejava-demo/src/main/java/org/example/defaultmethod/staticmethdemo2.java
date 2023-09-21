package defaultmethod;

interface printdemo
{
	static void printdemo()
	{
		System.out.println("hello printdemo");
	}
	public default void def()
	{
		System.out.println("hello default in parent");
	}
	//public static Object clone()
	//{
		
	//}
}
public class staticmethdemo2 implements printdemo {

	
	private final String helo;
	private static final String b;
	staticmethdemo2(String h)
	{
		this.helo=h;
		this.b=h;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printdemo.printdemo();
		
		staticmethdemo2 dd=new staticmethdemo2();
		new staticmethdemo2().printdemo();
		
		dd.def();
		
	}
	static void printdemo()
	{
		System.out.println("hello ===printdemo");
	}
	/*public  void def()
	{
		System.out.println("hello default in clll");
	}*/
}
