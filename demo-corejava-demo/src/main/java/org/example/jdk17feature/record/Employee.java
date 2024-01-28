package org.example.jdk17feature.record;

public record Employee(String name,int age)  {
    public Employee(String name, int age)  {

this.name=name;
this.age=age;
        if(age<18)
        {
            throw new IllegalArgumentException("");
        }
    }
}