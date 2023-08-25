package org.example.subjectivec8.identityfunc;

public class StudentGraduate {
    private String name;
    private String city;

    public StudentGraduate(String n, String c){
        this.name = n;
        this.city = c;
    }

    public String getName(){
        return this.name;
    }

    public String getCity(){
        return this.city;
    }

    public void setCity(String newCity){
        this.city = newCity;
    }

    public String toString(){
        return "Student:"+this.name + " in " + this.city;
    }
}



