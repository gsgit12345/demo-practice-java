package methodoveriding.methodoverloading;

public class OverloadedMethod {

	public void test(String test)
	{
		System.out.println("string version");
	}
	public void test(Object test)
	{
		System.out.println("string version");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadedMethod ov=new OverloadedMethod();
		ov.test(null);

	}

}
