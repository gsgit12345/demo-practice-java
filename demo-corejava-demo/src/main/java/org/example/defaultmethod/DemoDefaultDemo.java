package org.example.defaultmethod;

interface int1234
        {
           public default void sayDef()
           {
               System.out.println("hello say def");
           }
           public static void sayState()
           {
               System.out.println("hello say static methos");
           }
          /* public default int hashCode()
           {
               return 1;
           }*/
        }

public class DemoDefaultDemo implements int1234 {
    public  void sayDef()
    {
        System.out.println("hello DemoDefaultDemo def");
    }
    public static void sayState()
    {
        System.out.println("hello DemoDefaultDemo static methos");
    }

    public static void main(String str[])
    {
        DemoDefaultDemo  ob=new DemoDefaultDemo();
        ob.sayDef();
        DemoDefaultDemo.sayState();

        int1234  mm=new DemoDefaultDemo();

        int1234.sayState();

        Employee e1=new Employee();
        Employee e2=new Employee();
e1=e2;
        if(e1==e2)
        {
            System.out.println("=== comparison");
        }
        if(e1.equals(e2))
        {
            System.out.println("===equals comparison");
        }
    }

}
