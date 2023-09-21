package miscell;

public class printwithoutloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printt(10);
	}
public static void printt(int num)
{
	if(num>0)
	{
		System.out.println(num);
		printt(num-1);
		
		//System.out.println(num);
	}
}
}
