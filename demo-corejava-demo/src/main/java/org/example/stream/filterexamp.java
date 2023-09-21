package streamtut;

import java.util.ArrayList;
import java.util.List;

public class filterexamp {

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
		
		//memberNames.stream().filter((s)->s.startsWith("a")).forEach((s)->System.out.println(s));
		
		String arr[]=memberNames.stream().map(String::toUpperCase).filter((s)->s.startsWith("A")).toArray(String[]::new);
		
		for(String nn:arr)
		{
			System.out.println(nn);
		}

	}

}
