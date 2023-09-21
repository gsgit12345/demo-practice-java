package streamtut.groupby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartionByDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		partionByExample();
		partionByCountingExample();
	}
	
	public static void partionByExample()
	{
		Stream<Integer> stream=Stream.of(1,2,3,4,5,66,7,8,9,11,12,33,45,67);
		
		Map<Boolean,List<Integer> > map=stream.collect(Collectors.partitioningBy(num->num>3));
		
		System.out.println(map);
	}

	public static void partionByCountingExample()
	{
		Stream<Integer> stream=Stream.of(34,2,5,1,6,7,7,55,66,89,0,4,77,88);
		
		Map<Boolean,Long> map=stream.collect(Collectors.partitioningBy(num->num>6,Collectors.counting()));
		
		System.out.println(map);
	}
}
