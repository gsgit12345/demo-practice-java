package streamtut.groupby;

public class Student {
	  private String name;
	  public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Integer age;
	 
	  public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Student(String name, Integer age) {
	    this.name = name;
	    this.age = age;
	  }
	 
	  //Getters and Setters of name & age go here
	  public String toString(){
	    return "Employee Name:"+this.name
	        +"  Age:"+this.age;
	  }
	 
	  @Override
	  public boolean equals(Object obj) {
	    if (obj == this) {
	      return true;
	    }
	    if (!(obj instanceof Student)) {
	      return false;
	    }
	    Student empObj = (Student) obj;
	    return this.age == empObj.age
	        && this.name.equalsIgnoreCase(empObj.name);
	  }
	 
	  @Override
	  public int hashCode() {
	    int hash = 1;
	    hash = hash * 17 + this.name.hashCode();
	    hash = hash * 31 + this.age;
	    return hash;
	  }
	}
