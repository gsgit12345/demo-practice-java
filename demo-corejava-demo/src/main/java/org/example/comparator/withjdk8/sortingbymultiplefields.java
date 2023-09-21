package comparator.withjdk8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortingbymultiplefields {
	public static void main(String args[]) {
	    List<Student> students = Arrays.asList( // create list of employees
	            new Student("Arvind","Chandok", "Anderson Elementory School"), 
	            new Student("Jhon","Lambert", "Blair High School"), 
	            new Student("David","Hunn", "Anderson Elementory School"), 
	            new Student("Zoro","Mac", "Lovejoy high School"),
	            new Student("Mike","Yadav", "Curtis Middle School"));

	    
	    
	    
	    Comparator<Student> comparator = Comparator.comparing(Student::getFirstName)
	                           .thenComparing(Student::getSchoolName);  // join multiple fields
	    
	  List<Student>  list= students.stream() // get Stream
	        .sorted(comparator).collect(Collectors.toList());
	        // sort on multiple fields
	       // .forEach(System.out::println);
	  
	  System.out.println(list);
	}
}
