package org.example.narendra.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapFromListDemo {
    public static void main(String str[]) {
        List<String> names = Arrays.asList("java", "scala", "javascript", "ruby");
        Map<String, Integer> listtomap = names.stream().collect(Collectors.toMap(Function.identity(), a -> a.length()));

        System.out.println(listtomap.toString());

        sortListOfStringUsingLength(names);
        List<Integer> listpfint=Arrays.asList(4,3,12,56,7,8,123);

        findMaxValueInListOfInteger(listpfint);
    }

    public static void sortListOfStringUsingLength(List<String> list) {
        Comparator<Integer> comparator = (a, b) -> Integer.compare(a,b);
        List<String> listt = list.stream().sorted((a,b)->Integer.compare(a.length(),b.length())).collect(Collectors.toList());
        System.out.println(listt.toString());
    }
    public static void findMaxValueInListOfInteger(List<Integer> list)
    {
       int max= list.stream().max(Integer::compare).get();
        int min= list.stream().min(Integer::compare).get();
       System.out.println("max value is::"+max+":min:"+min);
    }
}
