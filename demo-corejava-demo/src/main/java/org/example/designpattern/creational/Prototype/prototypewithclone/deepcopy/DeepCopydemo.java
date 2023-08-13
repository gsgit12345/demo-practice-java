package org.example.designpattern.creational.Prototype.prototypewithclone.deepcopy;


public class DeepCopydemo {
    public static void main(String sr[]) throws CloneNotSupportedException {
        Department dept = new Department(1, "Human Resource");

Employee original1 = new Employee(1, "Admin", dept);
       Employee cloned = (Employee) original1.clone();

        //Let change the department name in cloned object and we will verify in original object
        cloned.getDepartment().setName("Finance1");

        System.out.println(original1.getDepartment().getName());
        System.out.println(cloned.getDepartment().getName());
    }
}
