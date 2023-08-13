package org.example.designpattern.creational.abstractfactorydesign;

public class WebDeveloperFactory extends  AbstractEmployeeFactory{
    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
