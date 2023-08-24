package org.example.subjectivec8.identityfunc;

import java.util.*;
import java.util.stream.Collectors;

public class IntermediateOperation {
    public static void main(String str[])
    {
       // peekMethod();
       // sortListUsingLambda();
        sortestToLongest();
    }

    public static void peekMethod()
    {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> newList = list.stream()
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println(newList);

    }
    public static void sortListUsingLambda()
    {
List<String>  stringList=Arrays.asList("Arman","Fatima","Rakesh","Neelam",null,"Catrina","Mohan");
        List<String>  stringList2=Arrays.asList("Arman","Fatima","Rakesh","Neelam",null,"Catrina","Mohan");
Comparator<String> nameComparator=(first,second)->first.compareTo(second);
      //Collections.sort(stringList,nameComparator);
      //System.out.println("nameComparator::"+stringList);
      //We would like to know how to sort a list with Null First.
        stringList2.sort(Comparator.nullsFirst(String::compareTo));
        System.out.println("nameComparatorNullFirst::"+stringList2);
        stringList2.sort(Comparator.nullsLast(String::compareTo));
        System.out.println("nameComparatorNullLast::"+stringList2);
        //We would like to know how to sort a null list with Optional.ofNullable and ifPresent.
        List<String> names3 = null;
        Optional.ofNullable(names3).ifPresent(list->list.sort(Comparator.naturalOrder()));
        System.out.println("names3::"+names3);
    }
    public static void sortestToLongest()
    {
        String[] array = { "Java", "C#", "Scala", "Basic", "C++", "Ruby", "Pyton",
                "Perl", "Haskell", "Jet" };
        //shortest to longest
        Arrays.sort(array,(a1,b1)->a1.length()-b1.length());

     //   Arrays.asList(array).forEach(x->System.out.print(x+","));
        Arrays.sort(array,(a1,b1)->b1.length()-a1.length());

        //Arrays.asList(array).forEach(x->System.out.print(x+","));
        System.out.println("\nAlphabetically by the first character only: ");
        Arrays.sort(array, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
        Arrays.asList(array).forEach(x->System.out.print(","+x));



    }

}

