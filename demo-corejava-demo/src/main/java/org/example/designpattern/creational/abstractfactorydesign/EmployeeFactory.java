package org.example.designpattern.creational.abstractfactorydesign;



import javax.xml.parsers.DocumentBuilderFactory;

public class EmployeeFactory {
    public static Employee getEmployee(AbstractEmployeeFactory abstractEmployeeFactory)
    {
        return abstractEmployeeFactory.createEmployee();
      //  DocumentBuilderFactory:-it implements the factory design pattern
    }
}
