package terminaloperation;

import java.util.Comparator;
import java.util.stream.Stream;

public class findminmaxnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Integer max=Stream.of(0,1,2,3,4,56,12,34,56,89).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);

		Integer min=Stream.of(0,1,2,3,4,56,12,34,56,89).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);
		System.out.println(min);
	}

}
