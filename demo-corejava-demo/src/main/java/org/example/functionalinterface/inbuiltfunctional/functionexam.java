package org.example.functionalinterface.inbuiltfunctional;

import java.util.function.Function;

public class functionexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String,Integer> func=x -> x.length();	
		Integer val=func.apply("hello");
		System.out.println(val);
		
		//andThen example.
		
		Function <Integer,Integer> func2=x-> x*2;
		
		Integer result=func.andThen(func2).apply("hello");
		
		System.out.println(result);

		
	}

}
