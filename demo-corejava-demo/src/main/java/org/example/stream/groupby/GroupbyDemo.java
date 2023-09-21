package streamtut.groupby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class GroupbyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Employee[] employees = {
	    	         new Employee("J", "Red", 51000, "IT"),
	    	         new Employee("A", "Green", 71600, "IT"),
	    	         new Employee("M", "Black", 35187.5, "Sales"),
	    	         new Employee("K", "Yellow", 47100.77, "Marketing"),
	    	         new Employee("L", "Pink", 62001, "IT"),
	    	         new Employee("D", "Blue", 32001, "Sales"),
	    	         new Employee("W", "Brown", 42361.4, "Marketing")};

	    	      // get List view of the Employees
	    	      List<Employee> list = Arrays.asList(employees);

	    	      // display all Employees
	    	      System.out.println("Complete Employee list:");
	    	      list.stream().forEach(System.out::println);
	    	      
/*	    	      // count number of Employees in each department
	    	      System.out.printf("%nCount of Employees by department:%n"); 
	    	      Map<String, Long> employeeCountByDepartment =
	    	         list.stream()
	    	             .collect(Collectors.groupingBy(Employee::getDepartment, 
	    	                TreeMap::new, Collectors.counting()));
	    	      employeeCountByDepartment.forEach(
	    	         (department, count) -> System.out.printf(
	    	            "%s has %d employee(s)%n", department, count));

*/
	    	      
	    	      
	    	      Map<String,Long> map=list.stream().collect(Collectors.groupingBy(Employee::getDepartment,TreeMap::new,Collectors.counting()));
	    	      
	    	      map.forEach((dept,count)->System.out.println( "dept:"+dept +"count:"+count));
	    	      
	    	      
	    	   
	}

}
