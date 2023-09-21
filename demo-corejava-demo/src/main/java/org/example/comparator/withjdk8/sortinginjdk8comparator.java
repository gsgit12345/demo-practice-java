package comparator.withjdk8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import comparator.withjdk7.Developer;

public class sortinginjdk8comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Developer> list=getDevelopers();
		
		list.forEach((Developer)->System.out.println(Developer));
		
		//list.sort((d1,d2)->d1.getAge()-d2.getAge());
		
		//list.forEach((Developer)->System.out.println("after sort::"+Developer));
		
		//Comparator<Developer> listCom=(d1,d2)->d1.getAge()-d2.getAge();
	//	list.sort(listCom);
		//list.forEach((d1)->System.out.println(d1.getAge()));
		
		list.sort((Developer dev,Developer dev1)->dev.getName().compareTo(dev1.getName()));
		
		list.forEach((Developer)->System.out.println(Developer.getName()));
		
		
	}
	public static List<Developer> getDevelopers()
	{
		List<Developer> listDev=new ArrayList<Developer>();
		listDev.add(new Developer(12, "rohit", 10000));
		listDev.add(new Developer(19, "shyam", 19000));
		listDev.add(new Developer(10, "karan", 11000));
		listDev.add(new Developer(11, "mukesh", 18000));
		listDev.add(new Developer(122, "hari", 7000));
		return  listDev;
	}
	
	
}
