package streamtut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeduplicatefromlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		ArrayList<Integer> duplist= new ArrayList<>(Arrays.asList(1,1,2,3,3,6,5,34,3412,78,45,65,34,5,5,65,76));
		
		List<Integer> dislist=	duplist.stream().distinct().collect(Collectors.toList());
		
		System.out.println(dislist);

	}

}
