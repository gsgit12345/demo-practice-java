package pojo;

public class Employee {
public String empName;
public int age;
public Employee(String empName, int age) {
	super();
	this.empName = empName;
	this.age = age;
}
@Override
public String toString() {
	return "Employee [empName=" + empName + ", age=" + age + "]";
}
//@Override
/*public int hashCode()
{
	return 1;
}*/
}
