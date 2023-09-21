package streamtut;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamfromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntStream intstream="abcdefgh".chars();
		intstream.forEach((k)->System.out.println(k));
		
		Stream<String> strstream=Stream.of("a$b$c".split("\\$"));
		strstream.forEach((k)->System.out.println(k));
		
	}

}
