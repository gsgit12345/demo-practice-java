package org.example.designpattern.creational.abstractfactorydesign;

public class BackendDeveloper implements Employee {
    @Override
    public int empSalary() {
        return 30000;
    }

    @Override
    public String getEmployeeType() {
        return "I am backend developer";
    }
}
