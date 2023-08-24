package org.example.subjectivec8.identityfunc;

import org.example.designpattern.creational.Prototype.prototypewithclone.deepcopy.Department;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RealTimeEmployeeQuestion {
    public static void main(String str[])
    {
        //countMaleAndFemalEmployee();
     //   printNameOfAllDepartment();
       // getAverageAge();
        //joinAfterXXXX();
        //getNumberOfEmployeeInEachDept();
       // findOldestOrMaxEmployee();
      //  findOutTotalAndAverageSalary();
      //  groupNameByGender();
       // findOutSeniorMostEmployeeInCompany();
       // findYoungestAndOldestMaleEmployeeInDepartment();
        findOutEmployeeGreaterThan25Years();
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
public static void findOldestOrMaxEmployee()
{
    //7. Find out the oldest employee, his/her age and department?
    List<RealTimeEmployee> employeeList=   loadEmployee();
   RealTimeEmployee employee = employeeList.stream().max(Comparator.comparingInt(RealTimeEmployee::getAge)).get();
   System.out.println("oldest employee::"+employee.toString());
   //oldest employee::Id : 166, Name : Iqbal Hussain, age : 43, Gender : Male, Department : Security And Transport, Year Of Joining : 2016, Salary : 10500.0
   RealTimeEmployee minSalary= employeeList.stream().max(Comparator.comparingDouble(RealTimeEmployee::getSalary)).get();
    System.out.println("minSalary employee::"+minSalary.toString());
    //minSalary employee::Id : 277, Name : Anuj Chettiar, age : 31, Gender : Male, Department : Product Development, Year Of Joining : 2012, Salary : 35700.0
}
    public static void findOutTotalAndAverageSalary()
    {
        //8. Find out the average and total salary of the organization.
        List<RealTimeEmployee> employeeList=   loadEmployee();
        DoubleSummaryStatistics empSalary=  employeeList.stream().collect(Collectors.summarizingDouble(RealTimeEmployee::getSalary));
    System.out.println("max sal::"+empSalary.getMax()+"minsal::"+empSalary.getMin()+"totalsal::"+empSalary.getSum());
    //collect all name into List
      List<String>  allEmployee= employeeList.stream().map(RealTimeEmployee::getName).collect(Collectors.toList());
      System.out.println("allEmployee:::"+allEmployee.toString());
      //convert elements to String and concate them togather and seperated by coma
        String  joinAllname= employeeList.stream().map(RealTimeEmployee::getName).collect(Collectors.joining(","));
        System.out.println("joinAllname:::"+joinAllname);
        //compute sum of salary of all employee
      double totalSalary=  employeeList.stream().collect(Collectors.summingDouble(RealTimeEmployee::getSalary));
        System.out.println("totalSalary:::"+totalSalary);
        //group employee by department
       Map<String,List<RealTimeEmployee>> employeesByDepartment = employeeList.stream().collect(Collectors.groupingBy(RealTimeEmployee::getDepartment));
        employeesByDepartment.forEach(
                (department, employeesInDepartment) ->
                {
                    System.out.println(department);
                    employeesInDepartment.forEach(
                            employee -> System.out.printf("   %s%n", employee));
                }
        );

       // System.out.println("group employee by department::"+employeesByDepartment.toString());
    }
public static void groupNameByGender()
{
    List<RealTimeEmployee> employeeList=   loadEmployee();
   Map<String,List<String>> groupNameBYGender= employeeList.stream().collect
           (Collectors.groupingBy(RealTimeEmployee::getGender,Collectors.mapping(RealTimeEmployee::getName,Collectors.toList())));
   //group name by gender::{Male=[Paul Niksui, Martin Theron, Murali Gowda, Iqbal Hussain, Manu Sharma, Wang Liu, Jaden Dough, Nitin Joshi, Nicolus Den, Ali Baig, Anuj Chettiar],
    // Female=[Jiya Brein, Nima Roy, Amelia Zoe, Jasna Kaur, Jyothi Reddy, Sanvi Pandey]}
    System.out.println("group name by gender::"+groupNameBYGender.toString());
    //9. List down the employees of each department.
        Map<String,List<String>> allEmployeeInEachdepartment=  employeeList.stream().
                collect(Collectors.groupingBy(RealTimeEmployee::getDepartment,Collectors.mapping(RealTimeEmployee::getName,Collectors.toList())));
  //allEmployeeInEachdepartment::{Product Development=[Murali Gowda, Wang Liu, Nitin Joshi, Sanvi Pandey, Anuj Chettiar],
    //Security And Transport=[Iqbal Hussain, Jaden Dough], Sales And Marketing=[Paul Niksui, Amelia Zoe, Nicolus Den],
    //Infrastructure=[Martin Theron, Jasna Kaur, Ali Baig], HR=[Jiya Brein, Nima Roy], Account And Finance=[Manu Sharma, Jyothi Reddy]}
        System.out.println("allEmployeeInEachdepartment::"+allEmployeeInEachdepartment.toString());
}
public static void findOutSeniorMostEmployeeInCompany()
{
    //10. Find out the senior  experienced employees in the organization
    List<RealTimeEmployee> employeeList=   loadEmployee();
    Optional<RealTimeEmployee> seniormostemployee=employeeList.stream().sorted(Comparator.comparingInt(RealTimeEmployee::getYearOfJoining)).findFirst();
    System.out.println("senior most emplyee in company=="+seniormostemployee.get().toString());
    //Query 3.3 : What is the average age of male and female employees?
    Map averagingAgeofMaleandFemale=employeeList.stream().collect(Collectors.groupingBy(RealTimeEmployee::getGender,
            Collectors.averagingInt(RealTimeEmployee::getAge)));
    System.out.println(averagingAgeofMaleandFemale.toString());
//below first min salaray and if you want the second,third min then pass the number in skip function
    Optional<RealTimeEmployee> secondMinxxxSalaried = employeeList.stream()
            .sorted(Comparator.comparingDouble(RealTimeEmployee::getSalary)).skip(1).findFirst();
System.out.println(secondMinxxxSalaried.toString());
//below first max salaray and if you want the second,third max then pass the number in skip function
    Optional<RealTimeEmployee> firstMaxxxxSalaried = employeeList.stream()
            .sorted(Comparator.comparingDouble(RealTimeEmployee::getSalary).reversed()).findFirst();
    System.out.println("max salary::"+firstMaxxxxSalaried.toString());
//Query 3.4 : Get the details of highest paid employee in the organization?
    Optional<RealTimeEmployee> highestPaidEmployeeWrapper=
            employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(RealTimeEmployee::getSalary)));
    System.out.println("highestPaidEmployeeWrapper::"+highestPaidEmployeeWrapper.toString());
    //Query 3.5 : Get the names of all employees who have joined after 2015?
   // List<String>  after2015employee=employeeList.stream().filter(emp->emp.getYearOfJoining()>2015).collect(Collectors.toList());
    List<String>  after2015employee=employeeList.stream().filter(emp->emp.getYearOfJoining()>2015).map(emp->emp.getName()).collect(Collectors.toList());
    System.out.println("after2015employee::"+after2015employee.toString());

}
    public static void findYoungestAndOldestMaleEmployeeInDepartment()
    {
        //Query 3.8 : Get the details of youngest male employee in the product development department?
        List<RealTimeEmployee> employeeList=   loadEmployee();
      Optional<RealTimeEmployee> youngestEmployee=  employeeList.stream().filter(emp->emp.getGender().equalsIgnoreCase("Male")
                &&emp.getDepartment().equalsIgnoreCase("Product Development")).min(Comparator.comparingInt(RealTimeEmployee::getAge));
      System.out.println("youngest employee::"+youngestEmployee.get().toString());
      //youngest employee::Id : 222, Name : Nitin Joshi, age : 25, Gender : Male, Department : Product Development, Year Of Joining : 2016, Salary : 28200.0
      //  Query 3.8 : Get the details of oldest male employee in the product development department?
        Optional<RealTimeEmployee> oldestEmployee=  employeeList.stream().filter(emp->emp.getGender().equalsIgnoreCase("Male")
                &&emp.getDepartment().equalsIgnoreCase("Product Development")).max(Comparator.comparingInt(RealTimeEmployee::getAge));
        System.out.println("oldestEmployee employee::"+oldestEmployee.get().toString());
        //Query 3.9 : Who has the most working experience in the organization?
      Optional<RealTimeEmployee> mostexperience= employeeList.stream().sorted(Comparator.comparingInt(RealTimeEmployee::getYearOfJoining)).findFirst();
        System.out.println("mostexperience employee::"+mostexperience.get().toString());
        //second way Query 3.9 : Who has the second most working experience in the organization?
        Optional<RealTimeEmployee> mostexperience2= employeeList.stream().sorted(Comparator.comparingInt(RealTimeEmployee::getYearOfJoining)).skip(1).findFirst();
        System.out.println("mostexperience2 employee::"+mostexperience2.get().toString());
        //Query 3.9 : Who has the min working experience in the organization?
        Optional<RealTimeEmployee> minexperience2= employeeList.stream().sorted(Comparator.comparingInt(RealTimeEmployee::getYearOfJoining).reversed()).findFirst();
        System.out.println("minexperience2 employee::"+minexperience2.get().toString());
        //Query 3.10 : How many male and female employees are there in the sales and marketing team?
       Map genderwiseemployeeinparticulardept= employeeList.stream().filter(emp->emp.getDepartment()=="Sales And Marketing").
                collect(Collectors.groupingBy(RealTimeEmployee::getGender,Collectors.counting()));
        System.out.println("genderwiseemployeeinparticulardept employee::"+genderwiseemployeeinparticulardept.toString());
    }
public static void findOutEmployeeGreaterThan25Years()
    {
        //Query 3.14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        List<RealTimeEmployee> employeeList=   loadEmployee();
        Map<Boolean, List<RealTimeEmployee>> employeGreaterthan25=   employeeList.stream().collect(Collectors.partitioningBy(emp -> emp.getAge() > 25));
        System.out.println("employeGreaterthan25 employee::"+employeGreaterthan25.toString());
        Stream<Integer>
                stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer> >
                map = stream.collect(
                Collectors.partitioningBy(num -> num > 3));
System.out.println("map greater than 3"+map.toString());
//map greater than 3{false=[1, 2, 3], true=[4, 5, 6, 7, 8, 9, 10]}
        Stream<Integer>
                stream2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, Long>
                map2 = stream2.collect(
                Collectors.partitioningBy(
                        num -> (num > 3), Collectors.counting()));
        System.out.println("map2 greater than 3"+map2.toString());


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
