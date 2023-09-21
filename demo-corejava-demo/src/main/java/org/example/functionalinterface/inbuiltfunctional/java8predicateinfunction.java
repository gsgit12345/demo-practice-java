package functionalinterface.inbuiltfunctional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class java8predicateinfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=Arrays.asList("ANM","BAC","CAT","OPU","LKP","GHT","FGH","KLP","LLL","FFF");
		
List<String> str=stringProcessor(list, x->x.startsWith("A"));		
		System.out.println(str);
		
		//chaining the predicate 
		
		Predicate<String> firstcon=x->x.length()==3;
		boolean result=firstcon.or(x->x.startsWith("Q")).test("BACAs");
		
		System.out.println(result);
		
        boolean result2 = firstcon.and(x -> x.length() == 3).negate().test("ANM");
        System.out.println(result2);    // false

		
	}
public static List<String> stringProcessor(List<String> list,Predicate<String> predicate)
{
	
	return list.stream().filter(predicate::test).collect(Collectors.toList());
}
}
