package miscell;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class printnumstartwith1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32,32,55);

		myList.stream().map(s->Integer.valueOf(s)).filter(s->s.toString().startsWith("1")).forEach(System.out::println);
		
		
	    String s = null;
	 // System.out.println(Optional.of(s));
	  
      Set<Integer> items = new HashSet<>();
      
      Set<Integer> items2=  myList.stream()
              .filter(n -> !items.add(n)) // Set.add() returns false if the element was already in the set.
              .collect(Collectors.toSet());
      System.out.println(items2);

	}

}
