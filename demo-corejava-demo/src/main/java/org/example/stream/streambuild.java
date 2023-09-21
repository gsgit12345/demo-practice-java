package streamtut;

import java.util.stream.Stream;

public class streambuild {

	public static void main(String[] args) {
		
		Stream<Integer> stream=Stream.of(1,6,8,9,5,34,90,78);
		
		stream.forEach((s)->System.out.println(s));

	}

}
