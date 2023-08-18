package org.example.subjectivec8;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class findevennum {
    public static void main(String str[])
    {
       // printEven();
       // findAllNumStartingWithOne();
        //findDuplicateInIntegers();
        findFirstElementInIntegers();
    }

    public static void printEven()
    {
        List<Integer> integerList= Arrays.asList(10,15,8,49,25,98,32);
        integerList.stream().filter(s->s%2==0).collect(Collectors.toList()).forEach(System.out::println);
      //  Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

    }
    public static void findAllNumStartingWithOne()
    {
        List<Integer> integerList= Arrays.asList(10,15,11,1,8,49,25,98,32);
        integerList.stream().map(num->num+"").filter(n->n.startsWith("1")).
                collect(Collectors.toList()).forEach(System.out::println);
     //   2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
    }
    public static void findDuplicateInIntegers()
    {
        List<Integer> integerList= Arrays.asList(10,15,11,1,8,8,1,49,25,98,32);
        Set hashSet=new HashSet();
        integerList.stream().filter(x->!hashSet.add(x)).collect(Collectors.toList()).forEach(System.out::println);
     //   3. How to find duplicate elements in a given integers list in java using Stream functions?
    }
    public static void findFirstElementInIntegers()
    {
        List<Integer> integerList= Arrays.asList(10,15,11,1,8,8,1,49,25,98,32);
        integerList.stream().findFirst().ifPresent(System.out::println);
       // 4. Given the list of integers, find the first element of the list using Stream functions?


    }


}
