package streamtut;

import java.util.stream.Stream;

public class streamfromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] array= {3,2,1,5,6,7,8,9,9};
		
		
		Stream<Integer> arraystream=Stream.of(array);
		arraystream.forEachOrdered((p)->System.out.println(p));

	}

}
