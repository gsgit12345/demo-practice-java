package org.example.subjectivec8.identityfunc;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String str[])
    {
        //listToMap();
        sortingMapByKeyOrValue();
    }
    public static void listToMap()
    {
        List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);

        List<Integer> sortedList = list.stream()
                .sorted( (i1, i2) -> i2.compareTo(i1) )
                .collect(Collectors.toList());
        System.out.println(sortedList);

        List<String> stringList= Arrays.asList("visa","mastercard","visha","icici card","hdfccard","mastercard");
    //Map <String, Integer> stringIntegerHashMap= stringList.stream().collect(Collectors.toMap(Function.identity(),String::length));
//above code will throw  Exception in thread "main" java.lang.IllegalStateException: Duplicate key 10
   // System.out.println("stringIntegerHashMap::;"+stringIntegerHashMap.toString());
        Map <String, Integer> stringIntegerHashMap= stringList.stream().collect(Collectors.toMap(Function.identity(),String::length,(e1,e2)->e1));
        //above code solves the above problem here we hade given (e1,e2)->e1 then we are selecting the first element from the list
        System.out.println("stringIntegerHashMap::;"+stringIntegerHashMap.toString());
        //map does not maintain the order if we want to maintain the order we have to use fourth parameter in toMap()
        Map <String, Integer>ordered= stringList.stream().collect(Collectors.toMap(Function.identity(),String::length,(e1,e2)->e1,LinkedHashMap::new));
        System.out.println("ordered::;"+ordered.toString());

    }
    public  static  void sortingMapByKeyOrValue()
    {
        HashMap<Integer,Employee> employeeHashMap=loadObject();


         Map<Integer,Employee>  sortedemployee1=    employeeHashMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(sortedemployee1.toString());
    }
public static HashMap<Integer,Employee> loadObject()
{
    HashMap<Integer,Employee> hashMap=new <Integer,Employee>HashMap();
    hashMap.put(1,new Employee(1,"rame",11));
    hashMap.put(2,new Employee(2,"suresh",12));
    hashMap.put(3,new Employee(3,"manish",13));
    hashMap.put(7,new Employee(4,"joohi",14));
    hashMap.put(5,new Employee(5,"naresh",15));

    return hashMap;
}
}
