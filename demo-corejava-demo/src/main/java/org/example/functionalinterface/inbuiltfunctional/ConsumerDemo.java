package org.example.functionalinterface.inbuiltfunctional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(2,4,5,6,7,8);
		
		Consumer<Integer> print=i->System.out.println(i);
		
		print.accept(5);
		
		listPrint(list, print);

	}
static void listPrint(List<Integer> list,Consumer<Integer> consume)
{
	for(Integer i:list)
	{
		consume.andThen(x->System.out.print("list:"+x*2)).accept(i);
	}
}
}
