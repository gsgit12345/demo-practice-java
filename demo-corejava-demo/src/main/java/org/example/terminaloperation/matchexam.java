package terminaloperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class matchexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");

		memberNames.add("Lokesh");
		
	boolean find=	memberNames.stream().anyMatch((s)->s.startsWith("R"));
	System.out.println(find);
	boolean find2=	memberNames.stream().allMatch((s)->s.startsWith("R"));
	long totalMatched = memberNames.stream()
		    .filter((s) -> s.startsWith("A"))
		    .count();
	
	System.out.println(totalMatched);
	
	Optional<String> reduced = memberNames.stream()
	        .reduce((s1,s2) -> s1 + "#" + s2);
	 
	reduced.ifPresent(System.out::println);


	}

}
