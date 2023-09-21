package designepattern.AbstractFactory;

public class FactoryCreator {

	
	public static    AbsSourceCourseFactory   getSourceCourseFactory(String type)
	{
		if(type.equalsIgnoreCase("source"))
		{
			return ;
		}
	}
	
}
