package methodoveriding.methodoverloading;

public class OverloadedMethod6 {
	public void test(char in)
	{
		System.out.println("char version");
	}
	public void test(int in)
	{
		System.out.println("int version");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadedMethod6 kl=new OverloadedMethod6();
		kl.test(8);//widening rule applicable
		kl.test('a');
	}

}
