package org.example.designpattern.creational.abstractfactorydesign;

public class AndroidDeveloper implements Employee {
    @Override
    public int empSalary() {
        return 1000;
    }

    @Override
    public String getEmployeeType() {
        return "i am android developer";
    }
}
