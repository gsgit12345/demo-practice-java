package org.example.narendra.array;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class  Employee {
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
    public class Java8ProgrammingQustion {
        public static void main(String str[]) {
         List<Employee> list=   getEmployeeList();

           // sortingByNameandSalary(list);
            sortingBySalary();
            //https://javatechonline.com/how-to-sort-the-list-in-java-8/
        }
        public static void sortingByNameandSalary(List<Employee> employees)
        {
            Comparator<Employee> employeeComparator=(a,b)->a.getName().compareTo(b.getName());
            Comparator<Employee> salaryComparator=(e1,e2)->Double.compare(e1.getSalary(),e2.getSalary());
          List<Employee> sorted=  employees.stream().sorted(employeeComparator.
                  thenComparing(salaryComparator)).collect(Collectors.toList());
          System.out.println(sorted.toString());
        }
        public static void sortingBySalary()
        {
            List<Integer>  integerList=Arrays.asList(3,2,1,6,21,45);
            integerList.sort(Comparator.naturalOrder());

           List<Employee> employeeList= getEmployeeList();
          Collections.sort(employeeList,Comparator.comparing(Employee::getSalary));
            System.out.println(employeeList.toString());
        }

        public static List<Employee> getEmployeeList()
        {
            List<Employee> employees = Arrays.asList(
                    new Employee("George", 10, 10000),
                    new Employee("Robert", 12, 15000),
                    new Employee("Kathy", 24, 25000)
            );
return  employees;
        }
    }

