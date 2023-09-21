package executerdemo.typicalquest;

public class findtherecursivefactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int fact=6;

System.out.println(Non_RecursiveFact(5));
	}

	
	public static int recursiveFact(int num)
	{
		
		if(num==0||num==1)
			return 1;	
		return  num*recursiveFact(num-1);
	}
	
	public static int Non_RecursiveFact(int num)
	{
		int fact=1;
		
		if(num==0||num==1)
			return fact;	
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		return  fact;
	}
}
