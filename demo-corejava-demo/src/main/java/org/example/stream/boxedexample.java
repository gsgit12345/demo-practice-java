package streamtut;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class boxedexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//List<Integer> arrlist=Arrays.asList(number).stream().boxed().

List<Integer> liste = Arrays.stream(number).boxed().collect(Collectors.toList());


	}

}
