package org.example.designpattern.creational.abstractfactorydesign;

public class TestAbstractFactory {
    public static void main(String str[])
    {
       Employee employee = EmployeeFactory.getEmployee(new BackendDeveloperFactory());
       System.out.println("backend developer:::"+employee.getEmployeeType());

        Employee employee1 = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
        System.out.println("AndroidDeveloperFactory developer:::"+employee1.getEmployeeType());
    }
}
