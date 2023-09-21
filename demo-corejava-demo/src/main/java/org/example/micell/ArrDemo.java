package misc;

import java.util.ArrayList;
import java.util.HashMap;

import pojo.Employee;

public class ArrDemo {

	public static void main(String[] args) {
	
 final ArrayList<String> array=new ArrayList<String>();

array.add("hello how are");
array.add("hello how are");
array.add("hello how are");
array.add("hello how are");


 ArrayList<String> array2=new ArrayList<String>();

array2.add("hello ");
array2.add("hello");
array2.add("hello");
array2.add("hello");
//array=array2;
System.out.println("array is"+array.toString());

HashMap<Employee,Employee> hashMap=new HashMap<Employee,Employee>();

Employee e1=new Employee("ram",10);

Employee e2=new Employee("ram",10);
Employee e3=new Employee("ram",10);

hashMap.put(e1, e1);
hashMap.put(e2, e2);
hashMap.put(e3, e3);

System.out.println("value in map::"+hashMap.toString());
 	}

}
