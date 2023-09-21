package streamtut;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class streamreducefun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stream<Integer> stream=Arrays.asList(1,3,5,8,07,3,12,67).stream();
		
		//int first=0;
		//int second=1;
Integer opt=stream.reduce((first,second)->first).orElse(1);

System.out.println(opt);
		

	}

}
