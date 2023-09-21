package org.example.algorithmn;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd(4);
	}

	
	public static void EvenOdd(int num)
	{
		if(num==1)
		{
			System.out.println("number is odd");
		}
		
		
		if(num%2==0)
		{
			System.out.println("number is even:"+num);
		}else
		{
			System.out.println("number is odd:"+num);

		}
	}
}
