package intermediateope;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class distinctexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stream <String>fruitsStream = Stream.of("Apple", "Jack Fruit", "Water Melon", "Apple");
		List<String> distinctStream = fruitsStream.distinct().collect(Collectors.toList());
		
		System.out.println(distinctStream);


	}

}
