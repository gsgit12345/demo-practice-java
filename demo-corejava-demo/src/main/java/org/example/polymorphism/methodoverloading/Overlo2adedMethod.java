package methodoveriding.methodoverloading;

class a
{
	
}
class b extends a
{
	
}
class c extends b
{
	
}
public class Overlo2adedMethod {

	public void test(b b)
	{
	System.out.println("b is")	;
	}
	public void test(c b)
	{
	System.out.println("c is")	;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overlo2adedMethod ob=new Overlo2adedMethod();//c is lowest in the hierarchy
		ob.test(null);
	}

}
