package streamtut;

import java.util.Random;
import java.util.stream.Stream;

public class randstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stream<Integer> randStream=Stream.generate(()->(new Random()).nextInt(100));
randStream.limit(2).forEach((k)->System.out.println(k));
		
	}

}
