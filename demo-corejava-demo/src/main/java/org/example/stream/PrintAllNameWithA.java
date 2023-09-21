package streamtut;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;




public class PrintAllNameWithA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Developer> allDev=getDevelopers();
		
		List<String> name=allDev.stream().filter((s)->s.getName().startsWith("h")).map((s)->s.getName()).collect(Collectors.toList());
		
		name.forEach((s)->System.out.println(s));
		
		
	}
	public static List<Developer> getDevelopers()
	{
		List<Developer> listDev=new ArrayList<Developer>();
		listDev.add(new Developer(12, "rohit", 10000));
		listDev.add(new Developer(19, "shyam", 19000));
		listDev.add(new Developer(10, "karan", 11000));
		listDev.add(new Developer(11, "mukesh", 18000));
		listDev.add(new Developer(122, "hari", 7000));
		listDev.add(new Developer(122, "harish", 7000));
		return  listDev;
	}
}
