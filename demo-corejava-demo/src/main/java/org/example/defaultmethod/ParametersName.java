package java8miscs;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParametersName {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		
	Method method=	ParametersName.class.getMethod("main",String.class);
	
	for(final Parameter param:method.getParameters())
	{
		System.out.println("param"+param);
	}

	}

}
//runtime exception