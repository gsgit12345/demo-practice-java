package StringJoinerex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStringExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> arrlist=new ArrayList(Arrays.asList("hello","java","demo","where","youe"));
		
		
		String  sd=arrlist.stream().collect(Collectors.joining("/"));
		System.out.println(sd);
		
		
		String kk=String.join("[", arrlist);
		
		System.out.println(kk);
		
		

	}

}
