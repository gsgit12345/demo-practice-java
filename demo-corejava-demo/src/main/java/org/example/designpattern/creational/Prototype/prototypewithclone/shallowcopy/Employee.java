package org.example.designpattern.creational.Prototype.prototypewithclone.shallowcopy;

public class Employee implements  Cloneable{
    private int empoyeeId;
    private String employeeName;
    private Address address;
    public int getEmpoyeeId() {
        return empoyeeId;
    }
    public void setEmpoyeeId(int empoyeeId) {
        this.empoyeeId = empoyeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee(int id, String name, Address dept)
    {
        this.empoyeeId = id;
        this.employeeName = name;
        this.address = dept;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}



