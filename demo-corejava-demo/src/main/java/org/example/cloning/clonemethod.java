package clonemethod;
class Employee implements Cloneable {
    int emp_id;
    String emp_name;
 
    // default constructor
    Employee(String emp_name, int emp_id)
    {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }
 
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

public class clonemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
            Employee ob1 = new Employee("Tom", 201);
 
            // Creating a new reference variable ob2
            // which is pointing to the same address as ob1
            Employee ob2 = (Employee)ob1.clone();
 
            System.out.println(ob1.emp_id + ", " + ob1.emp_name);
            System.out.println(ob2.emp_id + ", " + ob2.emp_name);
        }
        catch (CloneNotSupportedException c) {
            System.out.println("Exception: " + c);
        }

	}

}
