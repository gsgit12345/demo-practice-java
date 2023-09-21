package defaultmethod;

public class Employee  {
String id;
String name;
String address;

public Employee()
{
	
}
public Employee(int id)
{
	
}
public Employee(String name)
{
	this.name=name;
}
public Employee(String name,int id)
{
	
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Employee(String id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
}
