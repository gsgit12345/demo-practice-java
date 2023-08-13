package org.example.designpattern.creational.abstractfactorydesign;

public class BackendDeveloperFactory extends  AbstractEmployeeFactory{
    @Override
    public Employee createEmployee() {
        return new BackendDeveloper();
    }
}
