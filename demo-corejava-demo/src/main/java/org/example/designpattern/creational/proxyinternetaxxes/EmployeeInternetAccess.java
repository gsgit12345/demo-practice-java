package org.example.designpattern.creational.proxyinternetaxxes;

public class EmployeeInternetAccess implements InternetAccess {
    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    String employee;

    EmployeeInternetAccess(String employee) {
        this.employee = employee;
    }

    @Override
    public void grantInternetAccess() {
        System.out.println("internet access had given to employee" +employee);
    }
}
