package org.example.comparator.withjdk7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.xml.bind.helpers.DefaultValidationEventHandler;

public class Comparatorexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Developer> devList=getDevelopers();
		for(Developer de:devList)
		{
			//System.out.println("before sort:"+de);
		}
		
		/*List<Developer> devsort	=sortByAge(devList);
		for(Developer de:devsort)
		{
			System.out.println("after sort:"+de);
		}*/
		
		List<Developer> devname=sortByName(devList);
		
		for(Developer ded:devname)
		{
			System.out.println("after sort:"+ded);
		}
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
	
	public static List<Developer> sortByAge(List<Developer> devlist)
	{
		devlist.sort(new Comparator<Developer>() {

			@Override
			public int compare(Developer dev, Developer dev2) {
				// TODO Auto-generated method stub
				return dev.getAge()-dev2.getAge();
			}
			
			
		});
		
		return devlist;
	}
	public static List<Developer> sortByName(List<Developer> listName)
	{
		
		listName.sort(new Comparator<Developer>() {

			@Override
			public int compare(Developer dev, Developer dev2) {
				// TODO Auto-generated method stub
				return dev.getName().compareTo(dev2.getName());
			}
		});
		return listName;
	}
}
