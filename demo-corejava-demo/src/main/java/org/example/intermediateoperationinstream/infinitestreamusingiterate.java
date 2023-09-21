package intermediateope;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class infinitestreamusingiterate {

	public static void main(String[] args) {
		
		List<Integer> stream=IntStream.iterate(0, i->i+2).
				mapToObj(Integer::valueOf).limit(20).collect(Collectors.toList());
		stream.forEach(System.out::println);
		

	}

}
