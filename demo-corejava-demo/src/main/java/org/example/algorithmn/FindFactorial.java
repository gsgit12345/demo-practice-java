package org.example.algorithmn;

import java.util.stream.IntStream;

public class FindFactorial {
public static void main(String str[])
{
	int num=4;
	findFact(num);

	long l=IntStream.rangeClosed(1,5).reduce(1,(a,b)->a*b);
	System.out.println("lis:;"+l);
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
