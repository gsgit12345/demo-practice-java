package org.example.algorithmn;


public class printdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=235723312;
		System.out.println(printDigit(n, 3));

	}
public static int printDigit(int number,int find)
{
	int count=0;
	
	while(number>0)
	{
		int mod=number%10;
		
		if(mod==find)
		{
			count++;
		}
		number=number/10;
	}
	
	return count;
}
}
