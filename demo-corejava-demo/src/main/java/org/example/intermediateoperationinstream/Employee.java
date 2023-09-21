package intermediateope;

import java.io.Serializable;
import java.util.Random;

public class Employee implements Serializable {
	 
    private static final long serialVersionUID = 1L;
    private static final Random r = new Random(Integer.MAX_VALUE);  
 
    private long id;
    private String name;
    private double salary;
 
    public Employee(long id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
 
    //Getters and setters
 
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
     
    public static Employee create() {
        //Get the employee id in more predictable manner
        //e.g. Max id present in databse + 1
 
        Employee obj = new Employee(r.nextInt(), "", 0.0d);
        return obj;
    }
}
