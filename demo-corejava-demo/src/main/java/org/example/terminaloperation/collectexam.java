package terminaloperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class collectexam {

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
		
		List<String> sortedlist=memberNames.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(sortedlist);

	}

}
