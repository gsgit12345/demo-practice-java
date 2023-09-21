package terminaloperation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Getempminmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		List<Employee> employees = new ArrayList<Employee>();
		 
		employees.add(new Employee(1, "Lokesh", 36));
		employees.add(new Employee(2, "Alex", 46));
		employees.add(new Employee(3, "Brian", 52));
		 
		Employee min=employees.stream().min(Comparator.comparing(Employee::getAge)).get();
		
		Employee max=employees.stream().max(Comparator.comparing(Employee::getAge)).get();
		
		System.out.println("min age::"+min.getAge());
		System.out.println("max age::"+max.getAge());
		
		

	}

}
