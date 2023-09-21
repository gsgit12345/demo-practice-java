package java8miscs;

public class Student {
	
	String name;
	public Address  addr;
	public Student(String name,Address addr)
	{
		this.name=name;
		this.addr=addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	

}
