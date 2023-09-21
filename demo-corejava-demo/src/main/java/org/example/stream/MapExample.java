package streamtut;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample   
{  
public static void main(String args[])  
{  
System.out.println("Stream After applying the map() function: ");  
//creats a list of integers  
List<Integer> list = Arrays.asList(12, 45, 67, 19, 87, 2, 9);  
//creating a new stream of the elements an prints the same using the foreach loop  
list.stream().map(number -> number * 2).forEach(System.out::println);  





List<String>  arr=Arrays.asList("hello","radhe","jetha","meetha","mohan","pepper","name");

System.out.println(arr.stream().map(x->x.startsWith("m")).collect(Collectors.toList()));

}  
}  