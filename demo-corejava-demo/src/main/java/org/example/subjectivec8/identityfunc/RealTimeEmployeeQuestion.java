package org.example.subjectivec8.identityfunc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RealTimeEmployeeQuestion {
    public static void main(String str[])
    {
        //countMaleAndFemalEmployee();
     //   printNameOfAllDepartment();
       // getAverageAge();
        //joinAfterXXXX();
        getNumberOfEmployeeInEachDept();
    }
public static void countMaleAndFemalEmployee()
{
 List<RealTimeEmployee> employeeList=   loadEmployee();
 //Find out the count of male and female employees present in the organization?
   Map employees = employeeList.stream().collect(Collectors.groupingBy(gen->gen.getGender(),Collectors.counting()));
   System.out.println("number of male and female::"+employees.toString());
   //number of male and female::{Male=11, Female=6}
}
public static void printNameOfAllDepartment()
{
    List<RealTimeEmployee> employeeList=   loadEmployee();
   Set<String> department=  employeeList.stream().map(emp->emp.getDepartment()).collect(Collectors.toSet());
    System.out.println("all of department::"+department.toString());
    // all of department::[Product Development, Sales And Marketing, Security And Transport, Infrastructure, HR, Account And Finance]
}
public static void getAverageAge()
{
  //  3. Find the average age of Male and Female Employees.
    List<RealTimeEmployee> employeeList=   loadEmployee();

    Map averageAge=employeeList.stream().collect(Collectors.groupingBy(emp->emp.getGender(),Collectors.averagingInt(RealTimeEmployee::getAge)));
    System.out.println("average age of gender::"+averageAge.toString());
    //average age of gender::{Male=30.181818181818183, Female=27.166666666666668}

}
public static void joinAfterXXXX()
{
    List<RealTimeEmployee> employeeList=   loadEmployee();
   Set<String>  emplist=employeeList.stream().filter(x->x.getYearOfJoining()>2015).map(emp->emp.getName()).collect(Collectors.toSet());
    System.out.println("employee joine after 2015::"+emplist.toString());
    //employee joine after 2015::[Iqbal Hussain, Nicolus Den, Ali Baig, Nitin Joshi, Amelia Zoe]
    //4. Get the Names of employees who joined after 2015.
}
    public static void getNumberOfEmployeeInEachDept()
    {
       // 5. Count the number of employees in each department.
        List<RealTimeEmployee> employeeList=   loadEmployee();
    Map numEmpinEachDept=    employeeList.stream().collect(Collectors.groupingBy(RealTimeEmployee::getDepartment,Collectors.counting()));
        System.out.println("number of employee in each department::"+numEmpinEachDept.toString());
        //number of employee in each department::{Product Development=5, Security And Transport=2, Sales And Marketing=3, Infrastructure=3, HR=2, Account And Finance=2}
    }

    public static List<RealTimeEmployee> loadEmployee()
    {
        List<RealTimeEmployee> employeeList = new ArrayList<RealTimeEmployee>();

        employeeList.add(new RealTimeEmployee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new RealTimeEmployee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new RealTimeEmployee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new RealTimeEmployee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new RealTimeEmployee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new RealTimeEmployee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new RealTimeEmployee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new RealTimeEmployee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new RealTimeEmployee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new RealTimeEmployee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new RealTimeEmployee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new RealTimeEmployee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new RealTimeEmployee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new RealTimeEmployee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new RealTimeEmployee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new RealTimeEmployee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new RealTimeEmployee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        return employeeList;
    }
}
