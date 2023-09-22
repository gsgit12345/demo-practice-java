package org.example.intermediateoperationinstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream <String>vegStream = Stream.of("tomoto", "Green Chilli", "Pototo", "Beet root");

	List<String> str=	vegStream.sorted().collect(Collectors.toList());
	System.out.println(str);
	
	}

}
