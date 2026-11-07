package org.example.narendra.array.groupby;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupbyandSortExample {
    public static void main(String str[])
    {
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        Map<String,Long> countMap=items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        //sort this in ascending order by string
Map<String,Long>  hashMap=new LinkedHashMap<>();

countMap.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().
        reversed()).
        forEachOrdered(e->hashMap.put(e.getKey(),e.getValue()));

System.out.println(hashMap.toString());

       Map<String,Long> cc= countMap.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().
                reversed()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(o,l)->l,LinkedHashMap::new));
                //partionBy,maxBy,minBy,mapping,collectingAndThen,filtering

        System.out.println(cc.toString());


    }
}
