package org.example.designpattern.AbstractFactory;

public class ConcreteSourceCourseFactory extends AbsSourceCourseFactory {
    @Override
    public Source getSource(String sourceType)
    {
        return null;
    }
 
    @Override
    public Course getCourse(String courseType)
    {
        if(courseType.equalsIgnoreCase("programming"))
        {
            return new ProgrammingCourse();
        }
        else if(courseType.equalsIgnoreCase("non programming"))
        {
            return new NonProgrammingCourse();
        }
        else
        {
            return null;
        }   
    }
}
