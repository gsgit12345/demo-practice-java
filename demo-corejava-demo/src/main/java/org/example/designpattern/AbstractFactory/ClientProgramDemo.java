package org.example.designpattern.AbstractFactory;

public class ClientProgramDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsSourceCourseFactory course = FactoryCreator.getSourceCourseFactory("course");
        
        System.out.println(course.getCourse("programming").getCourseName());
 
        AbsSourceCourseFactory source = FactoryCreator.getSourceCourseFactory("source");
        System.out.println(source.getSource("online").getSourceName());

	}

}
