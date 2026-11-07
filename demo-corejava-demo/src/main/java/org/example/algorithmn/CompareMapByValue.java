package org.example.algorithmn;

import org.example.defaultmethod.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

class student
{
    String name;
    String age;

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }

    String dob;

    public student(String name, String age, String dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }
public student()
{

}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }


}
public class CompareMapByValue {
    public static void main(String str[])
    {
        student     st=new student("ram","12","01/11/2025");
        student     st1=new student("shyam","22","01/14/2025");
        student     st2=new student("karam","32","01/11/2024");
        student     st3=new student("mohit","42","01/11/2023");
        student     st4=new student("shyam","52","01/11/2022");
        student     st5=new student("anand","12","01/11/2025");
        student     st6=new student("Anand","12","01/11/2025");
        student     st7=new student("Zebrahim","12","01/11/2025");
        student     st8=new student("zebrahimm","12","01/11/2025");

        List<student> studentList= Arrays.asList(st,st1,st2,st3,st4,st5,st6,st7,st8);

        Comparator<student> comparator=(s1,s2)->s1.getName().compareTo(s2.getName());
        List<student> students=studentList.stream().sorted(comparator.reversed()).collect(Collectors.toList());
        System.out.println("studen list::;"+students.toString());
        //compare by one property
        List<student> dd=studentList.stream().sorted(Comparator.comparing(student::getName)).collect(Collectors.toList());
        System.out.println("sort list::;"+dd.toString());
        char z='Z';
        char a='A';

        System.out.println("z is ::"+(int)z+":a is:"+(int)a);

        // compare by using the lower case
        studentList.stream().sorted(Comparator.comparing(student->student.getName().toLowerCase())).
                collect(Collectors.toList());
        //compare by using the lower case and reverse the compararion

        studentList.stream().map(student-> {
                    student.setName(student.getName().toLowerCase());
                            return student;
                }
        ).sorted((s,s1)->s1.getName().compareTo(s.getName())).collect(Collectors.toList());

        System.out.println("lower case and sorting::"+studentList.toString());

    }

}
