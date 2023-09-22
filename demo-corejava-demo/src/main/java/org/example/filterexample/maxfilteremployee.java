package org.example.filterexample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class maxfilteremployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emplist=createEmployee();
		
		List<String> emplistname=emplist.stream().filter(em->em.getAge()>20).
				map(Employee::getName).collect(Collectors.toList());
		emplistname.forEach(name->System.out.println(name));
		
		
		
		System.out.println(emplistname);
		List<Employee> emplistname2=	emplist.stream().filter(em->em.getAge()>20).
				collect(Collectors.toList());
		
		System.out.println(emplistname2.toString());

	}
	
	
	public static List<Employee> createEmployee()
	{
		List<Employee> emp=new ArrayList<>();
		emp.add(new Employee("rakesh", 20));
		emp.add(new Employee("suresh", 30));
		emp.add(new Employee("ramesh", 40));
		emp.add(new Employee("kaushal", 50));
		emp.add(new Employee("hari", 60));
		return emp;
	}

}
