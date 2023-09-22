package org.example.intermediateoperationinstream;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class infinitestreamusinggenerate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> generate=Stream.generate(()-> (new Random()).nextInt(100)).
				limit(20).collect(Collectors.toList());
		generate.forEach(System.out::println);

	}

}
