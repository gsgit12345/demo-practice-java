package streamtut.groupby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningWithCollectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		partionByObjectExample();
		
		partionByObjectAndCountingExample();
	}
public static void partionByObjectExample()
{
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

	      
	    Map<Boolean,List<Employee> > empList= list.stream().collect(Collectors.partitioningBy((Employee emp)->emp.getDepartment().equalsIgnoreCase("It")));
	    
	    System.out.println(empList);
}
public static void partionByObjectAndCountingExample()
{
	   List<Student> employeeList = Arrays.asList(new Student("Tom Jones", 45),
		      new Student("Harry Major", 26),
		      new Student("Ethan Hardy", 65),
		      new Student("Nancy Smith", 22),
		      new Student("Catherine Jones", 21),
		      new Student("James Elliot", 58),
		      new Student("Frank Anthony", 55),
		      new Student("Michael Reeves", 40));

	      
	    Map<Boolean,Long > empList= employeeList.stream().collect(Collectors.partitioningBy((Student student)->student.getAge()>22,Collectors.counting()));
	    
	    System.out.println(empList);
}

}
