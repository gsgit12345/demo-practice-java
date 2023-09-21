package terminaloperation;

import java.util.Optional;
import java.util.stream.Stream;

public class MinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> streamMin = Stream.of(1, 2, 3, 4, 5).parallel();
		Optional<Integer> min = streamMin.min((v1, v2) -> v1.compareTo(v2));
		System.out.println("Min value : " + min.get());

	}

}
