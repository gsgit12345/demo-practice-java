package org.example.subjectivec8.identityfunc;

public class Employee {
    public int employeeId;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", deptName=" + deptName +
                ", salary=" + salary +
                '}';
    }

    public String employeeName;

    public String deptName;
    public int salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(int employeeId, String employeeName, String deptName, int salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.deptName = deptName;
        this.salary = salary;
    }



}
