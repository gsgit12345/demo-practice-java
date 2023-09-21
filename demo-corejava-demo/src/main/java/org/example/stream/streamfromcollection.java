package streamtut;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class streamfromcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> arr=new ArrayList<String>();
		
		arr.add("Rakesh");
		arr.add("Mohit");
		arr.add("rohit");
		arr.add("kumar");
		arr.add("mukesh");
		arr.add("arun");
		arr.add("harsh");
		
		Stream<String> arrstream=arr.stream();
		arrstream.forEach((o)->System.out.println(o));
		
		

	}

}
