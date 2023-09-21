package functionalinterface.functiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class bifunctionexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<Integer, Integer, Integer> bifunc=(x,y)->x+y;
		Integer re=bifunc.apply(4, 6);
		System.out.println(re);
		
		//returning list
		List<Integer> result=new ArrayList<>();
		BiFunction<Integer, Integer, List<Integer>> resultList=(x,y)->Arrays.asList(x+y);	
		result=resultList.apply(8, 90);
		System.out.println(result);
		
		
		BiFunction<Integer, Integer, Integer> resultList2=(x,y)->x*y;
		
		resultList2=resultList2.andThen(x->x+1);
	System.out.println(	resultList2.apply(2, 5));
		
	}

}
