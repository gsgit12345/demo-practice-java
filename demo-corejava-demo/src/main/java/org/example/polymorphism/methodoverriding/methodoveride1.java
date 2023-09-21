package executerdemo.methodoveriding;

class parent1
{
	static void hello() throws Exception
	{
		System.out.println("parent");
	}
}
class child1 extends parent1
{
	static  void hello() throws NullPointerException
	{
		System.out.println("child");
	}	
}
public class methodoveride1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent1 p=new child1();
		///p.hello();
		
		
	}

}
