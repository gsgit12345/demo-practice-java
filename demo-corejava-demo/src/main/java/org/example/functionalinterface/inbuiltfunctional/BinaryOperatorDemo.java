package org.example.functionalinterface.inbuiltfunctional;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
	
	public static void main(String str[])
	{
		BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
	Integer res=	func.apply(4, 5);
	System.out.println(res);
	
    BinaryOperator<Integer> func2 = (x1, x2) -> x1 + x2;

    Integer result2 = func2.apply(2, 3);
    
    System.out.println(result2);
    
    binaryOperatorOnList();
	}
public static void binaryOperatorOnList()
{
	
	List<Integer> list=Arrays.asList(1,4,5,6,7,8,9,12,14,56,7);
	
	BinaryOperator<Integer> operator=(x,y)->x+y;
	int sum=sum(list,0,(a,b)->a+b);
	
	int sum2=sum(list,0,operator);

	System.out.println(sum);
	
}
public static int sum(List<Integer> list,int init,BinaryOperator<Integer> operator)
{

	int result=init;
	for(Integer i:list)
	{
		result=operator.apply(result, i);
	}
	
	return result;
}
	}


