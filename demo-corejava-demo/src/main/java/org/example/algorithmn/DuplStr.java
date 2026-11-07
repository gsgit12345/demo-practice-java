package org.example.algorithmn;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplStr {
	 public static void main(String argu[]) {

	  String str = "w3schoolss";

	  Map<Character,Long> count=str.chars().mapToObj(a->(char)a).
			  collect(Collectors.
					  groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().
			  filter(entry->entry.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	  System.out.println(count.toString());

	  int cnt = 0;
	  char[] inp = str.toCharArray();
	  System.out.println("Duplicate Characters are:");
	  for (int i = 0; i < str.length(); i++) {
	   for (int j = i + 1; j < str.length(); j++) {
	    if (inp[i] == inp[j]) {
	    	
	     System.out.println(inp[j]);
	     cnt++;
	     break;
	    }
	   }
	  }
	 }

	}