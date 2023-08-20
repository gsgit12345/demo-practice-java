package org.example.subjectivec8.identityfunc;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class functionidentity {
    public static void main(String str[])
    {
        Function<Integer,Integer>  funct1=Function.identity();
        System.out.println(funct1.apply(10));
        Function<Integer, Integer> intFunction = e -> e; // using lambda expression
        System.out.println( intFunction.apply(10));
        List<String> names = Arrays.asList(
                "Peter",
                "Martin",
                "John",
                "Vijay",
                "Arthur"
        );

       // names.stream().map(Function.identity()).forEach(System.out::println);
      Stream<String> stringStream = names.stream().map(Function.identity());

       // names.stream().map(x->x).forEach(System.out::println);

        duplicateAlongWithNum();
    }

    public static void duplicateAlongWithNum()
    {
        List<String> names = Arrays.asList(
                "Peter",
                "Martin",
                "John",
                "Peter",
                "Vijay",
                // "Martin",
                // "Peter",
                "Arthur"
        );
        Set<String> namesSet = new HashSet(names);
        System.out.println(names.size()!=namesSet.size());

        names.stream()
                .map(getFunction(names, names.size() != namesSet.size()))
                .collect(Collectors.toSet())
                .forEach(System.out::println);


    }

    private static Function<String, String>  getFunction(List<String> names, boolean hasDuplicates) {
        // Collections.frequency(names, name) => to get duplicate count
        // names.size() != namesSet.size();// => true if duplicates
        return hasDuplicates ?
                name -> name+" =["+ Collections.frequency(names, name)+"]  Times"
                : Function.identity();


    }
}
