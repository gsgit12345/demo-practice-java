package executerdemo.nestedclass;

public class staticinnerdemo {

	public static class innerstat
	{
		public void hello()
		{
			System.out.println("hello static class");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticinnerdemo.innerstat ss= new staticinnerdemo.innerstat(); 
	}

}
