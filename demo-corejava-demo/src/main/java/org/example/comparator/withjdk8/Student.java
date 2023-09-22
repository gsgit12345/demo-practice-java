package org.example.comparator.withjdk8;
class Student{
    private String firstName;
    private String lastName;
    private String schoolName;
    public Student(String firstName, String lastName, String schoolName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.schoolName = schoolName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSchoolName() {
        return schoolName;
    }
    @Override
    public String toString() {
        return "{firstName= "+firstName+", lastName= "+lastName+", schoolName= "+schoolName+"}";
    }
}