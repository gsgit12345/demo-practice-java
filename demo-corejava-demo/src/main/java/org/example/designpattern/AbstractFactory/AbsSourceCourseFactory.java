package designepattern.AbstractFactory;

public abstract class AbsSourceCourseFactory  {
    public abstract Source getSource(String sourceType);
    
    public abstract Course getCourse(String courseType);

}
