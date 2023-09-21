package org.example.algorithmn;

public class FindFactorial {
public static void main(String str[])
{
	int num=4;
	findFact(num);
}

public static int findFact(int num)
{
	int fact=1;
	
	for(int i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	System.out.println("fact is:"+fact);
	return fact;
}
}
