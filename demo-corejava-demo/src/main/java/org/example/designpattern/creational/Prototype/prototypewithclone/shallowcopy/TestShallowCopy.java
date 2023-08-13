package org.example.designpattern.creational.Prototype.prototypewithclone.shallowcopy;

public class TestShallowCopy {
    public static void main(String str[]) throws CloneNotSupportedException {
    Address dept = new Address(1, "Human Resource");
    Employee original = new Employee(1, "Admin", dept);

    //Lets create a clone of original object
        try {
            Employee cloned = (Employee) original.clone();

            //Let verify using employee id, if cloning actually workded
            System.out.println(cloned.getEmpoyeeId());

            //Verify JDK's rules

            //Must be true and objects must have different memory addresses
            System.out.println(original != cloned);

            //As we are returning same class; so it should be true
            System.out.println(original.getClass() == cloned.getClass());

            //Default equals method checks for references so it should be false. If we want to make it true,
            //then we need to override equals method in Employee class.
            System.out.println(original.equals(cloned));

        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
System.out.println("=============testing the shallow copy of the object=====================");
        Address address = new Address(1, "F1 Address");

        Employee original1 = new Employee(1, "Admin", address);
        Employee cloned = (Employee) original1.clone();

        //Let change the department name in cloned object and we will verify in original object
        cloned.getAddress().setName("F2 Address");

        System.out.println("original address:"+original1.getAddress().getName());
        System.out.println("cloned address:"+cloned.getAddress().getName());


    }

}
