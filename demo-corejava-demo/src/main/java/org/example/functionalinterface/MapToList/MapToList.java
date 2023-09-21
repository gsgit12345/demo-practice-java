package functionalinterface.MapToList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student stud=new Student(1,"Hari");
Student stud1=new Student(2,"Harish");
Student stud2=new Student(3,"Harindra");
Student stud3=new Student(4,"ravindra");
Student stud4=new Student(5,"kareem");
Student stud5=new Student(6,"karendra");
Student stud6=new Student(7,"karend");
Map<Integer,Student> maptolist =new HashMap<Integer, Student>();
maptolist.put(1, stud);
maptolist.put(2, stud1);
maptolist.put(3, stud2);
maptolist.put(4, stud3);
maptolist.put(5, stud4);
maptolist.put(6 ,stud5);
maptolist.put(7 ,stud6);
List<Integer>  list=mapToListInJava8(maptolist);
//List<Integer>  list=mapToJava8(maptolist);
//List<Student>  list=mapToJava8Value(maptolist);
//Consumer<Student>  list1=a->System.out.println(a.toString());
//list1.accept(stud5);
System.out.println(list);

//list.forEach((c)->System.out.println(c.getName()));
//for(Student std:list)
//{
//System.out.println(std.toString());
//System.out.println(std.getId()+":"+std.getName());
//}


	}
public static  List<Integer> mapToListInJava8(Map<Integer,Student> maptolist)
{
	List<Integer> list=maptolist.keySet().stream().collect(Collectors.toList());
	
	return list;
}

public static List<Integer> mapToJava8(Map<Integer,Student> maptolist)
{
	List<Integer> listTo=maptolist.keySet().stream().collect(Collectors.toCollection(ArrayList::new));
	
	return listTo;
}
public static List<Student> mapToJava8Value(Map<Integer,Student> maptolist)
{
	List<Student> listTo=maptolist.values().stream().collect(Collectors.toCollection(ArrayList::new));
	
	return listTo;
}

}
