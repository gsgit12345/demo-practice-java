package streamtut;

import java.util.ArrayList;
import java.util.List;

public class streamsortedexam {

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
		
		memberNames.stream().sorted().map(String::toUpperCase).forEach((s)->System.out.println(s));

	}

}
