package miscell;

class objdemo
{
	private int data=40;
	int x=30;
	private void message()
	{
		System.out.println("hello");
	}
	
	public void assign(int x)
	{
		x=x;
		System.out.println(x);
		
	}
}
public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


objdemo dd=new objdemo();

dd.assign(100);
	}

}
