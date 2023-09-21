package intermediateope;

import java.util.stream.Stream;

public class FlatMapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
		  String[] result = Stream.of(array)  // Stream<String[]>
		          .flatMap(Stream::of)        // Stream<String>
		          .toArray(String[]::new);    // [a, b, c, d, e, f]
		  
		  for(String s:result)
		  {
			  System.out.println(s);
		  }

	}

}
