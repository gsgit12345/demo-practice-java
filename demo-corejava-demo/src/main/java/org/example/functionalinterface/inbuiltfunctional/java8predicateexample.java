package org.example.functionalinterface.inbuiltfunctional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class java8predicateexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> list=Arrays.asList(2,3,12,89,56,4,1,0,7,88,14);
		
		List<Integer> sorted=list.stream().filter(x->x>5).collect(Collectors.toList());
		System.out.println(sorted);
		//or you can do like this ====================================
		
		Predicate<Integer> predicate=x->x>5;
		
		List<Integer> list2=list.stream().filter(predicate).collect(Collectors.toList());
		
		System.out.println(list2);
		
		//predicate && example ======================================
		
		
		List<Integer> list3=list.stream().filter(x->x>1&&x<12).collect(Collectors.toList());
		
		System.out.println(list3);
		
		//we can write this using and ================================================================
		
		Predicate<Integer> greater=x->x>1;
		Predicate<Integer> lessthan=x->x<17;

		List<Integer> list6=list.stream().filter(greater.and(lessthan)).collect(Collectors.toList());
		
		System.out.println(list6);
		
		//we can write or operator   in predicate
		
		List<String> liststr=Arrays.asList("ANM","AA","BB","NNN","MMM","OOO","PPP","RRR");
		
		Predicate<String> lencheck=x->x.length()==3;
		Predicate <String>  startwith=x->x.equalsIgnoreCase("A");
		
		List<String>  strlen=liststr.stream().filter(lencheck.or(startwith)).collect(Collectors.toList());
		System.out.println(strlen);
		
//find all elements not start with A.
		
		Predicate<String> negate=x->x.endsWith("A");
		
		List<String> str=liststr.stream().filter(negate.negate()).collect(Collectors.toList());
		System.out.println(str);
		

	}

}
