package executerdemo.typicalquest;

public class ReversingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=123456;
sumofNum(num);
	}
	
public static void printNum(int num)
{
	int mode;
	int reverse=0;
	
	while(num>=1)
	{
		mode=num%10;
		reverse=reverse*10+mode;
		num=num/10;
		//System.out.print(mode+",");
	}
	
	System.out.print(reverse);
}


public static void sumofNum(int num)
{
	int mode;
	int reverse=0;
	
	int sum=0;
	
	while(num>=1)
	{
		mode=num%10;
		//reverse=reverse*10+mode;
		sum+=mode;
		num=num/10;
		//System.out.print(mode+",");
	}
	
	System.out.print(sum);
}

}
