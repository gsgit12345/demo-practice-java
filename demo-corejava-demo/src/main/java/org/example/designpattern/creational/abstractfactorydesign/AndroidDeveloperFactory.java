package org.example.designpattern.creational.abstractfactorydesign;

public class AndroidDeveloperFactory  extends AbstractEmployeeFactory{
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
