package org.example.functionalinterface.functiondemo;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class binullreturning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BiFunction<Integer, Integer, Integer> biex=(x,y)->x*y;
		
		System.out.println(biex=biex.andThen(null));
		
		
		BiFunction<Integer, Integer, Integer> arith=(x,y)->x*y;
		
		arith=arith.andThen(x->x/(x-10));
	System.out.println(	arith.apply(2, 5));
	
	 

	}

}
