package functionalinterface.inbuiltfunctional;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BiPredicate<String,Integer> bipredicate=(x,y)->{return x.length()==y;};
		
		System.out.println(bipredicate.test("hello", 5));
		
        BiPredicate<String, String> startsWith = String::startsWith;
        BiPredicate<String, String> biPredicate = startsWith.and(String::endsWith);
        boolean b = biPredicate.test("enough is enough", "enough");
        System.out.println(b);
        b = biPredicate.test("she is tall", "tall");
        System.out.println(b);

	}

}
