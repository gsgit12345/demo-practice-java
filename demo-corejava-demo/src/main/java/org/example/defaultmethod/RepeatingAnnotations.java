package java8miscs;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class RepeatingAnnotations {

	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Filters
	{
		Filter[] value();
	}
	
	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	@Repeatable(Filters.class)
	public @interface Filter
	{
		String value();
	}
	@Filter("filter1")
	@Filter("filter2")
	public interface filterable
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(Filter fil:filterable.class.getAnnotationsByType(Filter.class))
{
	System.out.println(fil.value());
}
	}

}
