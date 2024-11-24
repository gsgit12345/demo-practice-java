package org.example.cloning;

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