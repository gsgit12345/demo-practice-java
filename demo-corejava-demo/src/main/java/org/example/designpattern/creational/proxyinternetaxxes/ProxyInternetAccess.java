package org.example.designpattern.creational.proxyinternetaxxes;

public class ProxyInternetAccess implements InternetAccess {
    public
    String employee;
    EmployeeInternetAccess internetAccess;

    ProxyInternetAccess(String employee) {
        this.employee = employee;
    }

    @Override
    public void grantInternetAccess() {
        if (getGrade() >= 4) {
            internetAccess = new EmployeeInternetAccess(employee);
            internetAccess.grantInternetAccess();
            ;
        } else {
            System.out.println("grade below is");
        }
    }

    public int getGrade() {
        return 4;
    }
}
