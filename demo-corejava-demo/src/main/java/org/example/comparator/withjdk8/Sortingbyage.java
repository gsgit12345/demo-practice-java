package comparator.withjdk8;

import org.example.comparator.withjdk7.Developer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sortingbyage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Developer> devlist=new ArrayList<Developer>();
        devlist.add(new Developer(10, "harish", 200));
        devlist.add(new Developer(22, "rakesh", 300));
        devlist.add(new Developer(24, "praksah", 1300));
        devlist.add(new Developer(34, "suresh", 1800));
        devlist.add(new Developer(30, "sureshki", 1200));
        devlist.add(new Developer(3, "aureshkikkk", 1900));
        devlist.add(new Developer(0, "bureshkiooo", 18200));
        System.out.println(sortingByAge(devlist).toString());
        
        Developer dev=new Developer(3, "aureshkikkk", 1900);
        Developer dev2=new Developer(3, "aureshkikkk", 1900);
        
        
       // dev=dev2;
        String s=new String("hello");
        String s2=new String("hello");
        
        if(s.equals(s2))
        {
        	System.out.println("stringequal");	
        }else
        {
        	System.out.println("string not==equal");
        }
        if(dev==dev2)
        {
        	System.out.println("equal");	
        }else
        {
        	System.out.println("not==equal");
        }
        if(dev.equals(dev2))
        {
        	System.out.println("equal");
        }else
        {
        	System.out.println("not equal");	
        }
	}
	
	public static List<Developer>  sortingByAge(List<Developer>  list)
	{
		
		List<Developer> output=list.stream().sorted(Comparator.comparingInt(Developer::getAge)).
				collect(Collectors.toList());//comparing by age.
		List<Developer> output1=list.stream().sorted(Comparator.comparing(Developer::getName).reversed()).collect(Collectors.toList());
		
		
		Comparator<Developer> compareByName = (Developer o1, Developer o2) -> o1.getName().compareTo( o2.getName() );//it is only in case of string
		Collections.sort(list, compareByName);
		
		
		return list;
	}

}
