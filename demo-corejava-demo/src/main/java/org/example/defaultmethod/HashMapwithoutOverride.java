package org.example.defaultmethod;

import java.util.HashMap;


class hello
{

	 static public  void main(String[] args) {
		// TODO Auto-generated method stub
		Student emp1 = new Student("One");
		Student emp2 = new Student("One");

		HashMap<Student, String> hm = new HashMap<Student, String>();

		hm.put(emp1, "One");
		hm.put(emp2, "Two");
		
		System.out.println("Both Objects are Equal: "+emp1.equals(emp2));
		System.out.println("Employee 1 Hashcode: "+emp1.hashCode());
		System.out.println("Employee 2 Hashcode: "+emp2.hashCode());
		hm.forEach((k, v) -> System.out.println("Key is: " + k + " Value is: " + v));
		
		//return 0;

	}

}

public class HashMapwithoutOverride  {
	
	

 static public  void main(String[] args) {
	 
	 
 
		// TODO Auto-generated method stub
	Student emp1 = new Student("One");
		Student emp2 = new Student("One");

		HashMap<Student, String> hm = new HashMap<Student, String>();

		hm.put(emp1, "One");
		hm.put(emp2, "Two");
		
		System.out.println("Both Objects are Equal: "+emp1.equals(emp2));
		System.out.println("Employee 1 Hashcode: "+emp1.hashCode());
		System.out.println("Employee 2 Hashcode: "+emp2.hashCode());
		hm.forEach((k, v) -> System.out.println("Key is: " + k + " Value is: " + v));
		
		//return 0;
		
		Employee e=new Employee();
		Employee e2=new Employee("hello");
		
		System.out.println(e2.getAddress()+":"+e2.getName()+":"+e2.getId());
		
		Student ss=new Student("hello");
		
		System.out.println(ss.name2);
		
		System.out.println(ss.name);
		
		

}

}
