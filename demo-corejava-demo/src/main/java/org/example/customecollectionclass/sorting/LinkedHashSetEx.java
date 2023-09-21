package algorithm.sorting;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		set.add("abc");
		set.add("nbc");
		set.add("kbc");
		set.add("kbc");
		set.add(null);
		set.add(null);
		System.out.println(set.toString());
		
		
	}

}
