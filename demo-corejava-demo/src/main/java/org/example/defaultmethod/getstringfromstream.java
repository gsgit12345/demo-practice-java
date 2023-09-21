package org.example.defaultmethod;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import sun.net.www.content.image.x_xbitmap;

public class getstringfromstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list=getStudent();
		
		//String name=list.stream().map(x->x.getAddr().getProimary().endsWith("de")).collect();
		List<String>  aa=list.stream().filter(x->x.getAddr().getProimary().startsWith("de")).map(xx->xx.getAddr().getProimary()).collect(Collectors.toList());
              System.out.println(aa.toString())  ;        
		//System.out.println(name);

	}

	public static List<Student>  getStudent()
	{
		List<Student> l=new ArrayList<Student>();
		l.add(new Student("harish",new Address("delhi")));
		l.add(new Student("harish2",new Address("new delhi")));
		l.add(new Student("harish4",new Address("varanasi")));
		
		return l;
		
	}
}
