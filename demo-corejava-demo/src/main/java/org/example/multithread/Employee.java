package executerdemo;

import java.time.LocalDate;

public class Employee implements Comparable<Employee> {
	 
    private Long id;
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	private String name;
    private LocalDate dob;
 
    public Employee(Long id, String name, LocalDate dob) {
        super();
        this.id = id;
        this.name = name;
        this.dob = dob;
    }
     
    @Override
    public int compareTo(Employee emp) {
        return this.getId().compareTo(emp.getId());
    }
 
    //Getters and setters
 
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + "]";
    }
}