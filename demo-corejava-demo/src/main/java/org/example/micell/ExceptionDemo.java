package miscell;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
		String ss=method();
		
		System.out.println(ss);
}catch(Exception ex)
{
	ex.printStackTrace();
}
	}

	
	public static String method()
	{
		
		try
		{
			System.out.println("1");
			int a = 12 / 0;
			System.out.println("2");
		}catch(Exception ex)
		{
			System.out.println("3");
			int a = 12 / 0;
			System.out.println("4");
		}finally
		{
			System.out.println("5");
		}
		return "return";
	}
}
