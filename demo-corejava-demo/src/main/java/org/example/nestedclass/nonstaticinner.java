package executerdemo.nestedclass;

public class nonstaticinner {
	int a=90;
	public class innerdemo
	{
		final int h=90;
		public  void inner()
		{
			System.out.println("hello inner class");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		nonstaticinner.innerdemo aaa=new nonstaticinner().new innerdemo();
		
		aaa.inner();
		
	}

}
