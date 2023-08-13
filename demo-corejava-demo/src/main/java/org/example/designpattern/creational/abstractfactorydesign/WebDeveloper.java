package org.example.designpattern.creational.abstractfactorydesign;

public class WebDeveloper implements Employee{
    @Override
    public int empSalary() {
        return 20000;
    }

    @Override
    public String getEmployeeType() {
        return "i am webdeveloper";
    }
}
