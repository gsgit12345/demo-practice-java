package org.example.micell;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxedStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> intstream=IntStream.of(2,3,12,34,54,64).boxed().collect(Collectors.toList());
		
		System.out.println(intstream);
		
		Optional<Integer> maxnum=IntStream.of(2,3,12,34,54,64).boxed().max(Integer::compareTo);
		
		System.out.println(maxnum.get());

	}

}
