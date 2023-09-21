package org.example.typicalquestion;

public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//findFibNum(5);
		
		
		for(int i=0;i<=5;i++)
		{
			System.out.println(findFibNumUsingRecursion(i));
		}
	}

	public static void findFibNum(int num)
	{
	int first=0;
	int second=1;
	int result=0;
	for(int i=0;i<=num;i++)
	{
		System.out.println(result);
		first=second;
		second=result;
		result=first+second;
	}
	}
	
	public static int findFibNumUsingRecursion(int num)
	{
		if(num==0||num==1)
			return num;
		
		return findFibNumUsingRecursion(num-1)+findFibNumUsingRecursion(num-2);
		
	}
}
