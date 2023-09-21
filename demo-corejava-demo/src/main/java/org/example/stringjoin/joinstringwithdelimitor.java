package StringJoinerex;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class joinstringwithdelimitor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringJoiner join=new StringJoiner(",");
		join.add("hello");
		join.add("java");
		join.add("program");
		
		System.out.println(join);
		
		StringJoiner join2=new StringJoiner("/","prefix-","-suffix");
		join2.add("2018");
		join2.add("05");
		join2.add("12");
		System.out.println(join2);
		
//using the join method
	String st=String.join("/", "2017","09","26");
	System.out.println(st);
	
    List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");

	String hhh=	String.join("-", list);
	System.out.println(hhh);
	}

}
