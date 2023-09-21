package terminaloperation;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Stream<Integer> streamReduce = Stream.of(1, 2, 3, 4, 5);
		Optional<Integer> sum = streamReduce.reduce((value1, value2) -> value1 + value2);
		System.out.println("sum of first 5 numbers using reduce opration : " + sum.get());
	}

}
