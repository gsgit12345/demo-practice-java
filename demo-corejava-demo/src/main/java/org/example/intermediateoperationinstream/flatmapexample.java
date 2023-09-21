package intermediateope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatmapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		List<Integer> list=Arrays.asList(1,2,3);
		List<Integer> list2=Arrays.asList(4,5,6);
		List<Integer> list3=Arrays.asList(7,8,9);
		
		List<List<Integer>> list4=Arrays.asList(list,list2,list3);
		
		System.out.println(list4);
		List<Integer> combined=list4.stream().
				flatMap((s)->s.stream()).collect(Collectors.toList());
		
		//combined.forEach(System.out::println);
		
		List<String> lists=Arrays.asList("a","b","c");
		List<String> listtr=Arrays.asList("d","e","f");
		List<String> listr=Arrays.asList("g","h","i");
		List<List<String>> list4s=Arrays.asList(lists,listtr,listr);
		
		ArrayList arr=	list4s.stream().flatMap((s)->s.stream()).
		collect(Collectors.toCollection(ArrayList::new));
		System.out.println(arr);

	}

}
