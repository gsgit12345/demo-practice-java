package org.example.comparator.withjdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findevennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<String> listNum=Arrays.asList("1","2","34","11","33","14","9","3","12","2","6","8");
		List<Integer> listEven=listNum.
				stream().
				map(s->Integer.valueOf(s)).
				filter(num->num%2==0)
				.collect(Collectors.toList());

	System.out.println(listEven);
	
	List<Integer> listOdd=listNum.
			stream().
			map(s->Integer.valueOf(s)).
			filter(num->num%2!=0)
			.collect(Collectors.toList());
		
	System.out.println(listOdd);
	}

}
