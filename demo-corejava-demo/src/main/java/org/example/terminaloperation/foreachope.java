package terminaloperation;

import java.util.ArrayList;
import java.util.List;

public class foreachope {

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
		
	//	memberNames.stream().forEach((s)->System.out.println(s));
		
		memberNames.stream().forEach(System.out::println);

	}

}
