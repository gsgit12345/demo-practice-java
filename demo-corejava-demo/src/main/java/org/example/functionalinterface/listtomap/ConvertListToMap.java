package org.example.functionalinterface.listtomap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {

	public static void main(String[] args) {
		
		Animal animal=new Animal(1,"Rakesh");
		Animal animal1=new Animal(3,"Parveesh");
		Animal animal2=new Animal(4,"Harsh");
		Animal animal3=new Animal(5,"Harm");
		Animal animal4=new Animal(6,"Kareem");
		Animal animal5=new Animal(7,"hari");
		Animal animal8=new Animal(8,"hukar");
		Animal animal9=new Animal(9,"reeta");
		
		List<Animal> list=new ArrayList<Animal>();
		
		list.add(animal);
		list.add(animal1);
		list.add(animal2);
		list.add(animal3);
		list.add(animal4);
		list.add(animal5);
		list.add(animal8);
		list.add(animal9);
		Map<Integer,Animal> listtomap=	convertListToMap(list);
		
		System.out.println(listtomap);
		
		//for()

	}
public static Map<Integer,Animal> convertListToMap(List<Animal> list)
{
	Map<Integer,Animal> listToMap=list.stream().
			collect(Collectors.toMap(Animal::getId, obj->obj,(ol,ol1)->ol,HashMap::new));
	return listToMap;
}
	
}
