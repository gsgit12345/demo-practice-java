package methodoveriding.methodoverloading;

public class OverloadedMethod7 {
public void test(Long it)
{
	System.out.println("long version");
}
public void test(Integer it)
{
	System.out.println("integer version");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadedMethod7 it=new OverloadedMethod7();
	//	it.test(null);//ambiguous
		short s=10;
		it.test(s);//you can not widen and then box
	}

}
