package org.example.micell;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMethodInJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     List<Employee> employeeList = Arrays.asList(
	            new Employee("Tom", 45, 7000.00),
	            new Employee("Harry", 25, 10000.00),
	            new Employee("Ethan", 65, 8000.00),
	            new Employee("Nancy", 22, 12000.00),
	            new Employee("Deborah", 29, 9000.00));

	     
	     
	     Double totalSalaryExpense = (Double) employeeList.stream().map(emp -> emp.getSalary()).reduce(0.00,(a,b) -> a+b);
	        System.out.println("Total Salary Expense?= " + totalSalaryExpense + "\n");
	 
	        /***** E.g. #2 - Employee Details Having Maximum Salary *****/
	        Optional<Employee> maxSalaryEmp = employeeList.stream().reduce((Employee a, Employee b) -> a.getSalary() < b.getSalary() ? b:a);
	        if(maxSalaryEmp.isPresent()) {
	            System.out.println("Employee with Max. Salary?= "+ maxSalaryEmp.get());
	        }


	}

}
