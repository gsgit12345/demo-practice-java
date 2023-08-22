package org.example.subjectivec8;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class findevennum {
    public static void main(String str[]) {
        // printEven();
        // findAllNumStartingWithOne();
        //findDuplicateInIntegers();
        // findFirstElementInIntegers();
        // getFirstNonRepeatedCharacter();
        //getFirstRepeated();
        //sortingTheList();
        //returnTrueFalseIfListContainsDuplicate();
       // concateTwoStream();
       // cubeAndFilter();
        sortAndConvertIntoStream();
    }

    public static void printEven() {
        List<Integer> integerList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        integerList.stream().filter(s -> s % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);
        //  Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

    }

    public static void findAllNumStartingWithOne() {
        List<Integer> integerList = Arrays.asList(10, 15, 11, 1, 8, 49, 25, 98, 32);
        integerList.stream().map(num -> num + "").filter(n -> n.startsWith("1")).
                collect(Collectors.toList()).forEach(System.out::println);
        //   2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
    }

    public static void findDuplicateInIntegers() {
        List<Integer> integerList = Arrays.asList(10, 15, 11, 1, 8, 8, 1, 49, 25, 98, 32);
        Set hashSet = new HashSet();
        integerList.stream().filter(x -> !hashSet.add(x)).collect(Collectors.toList()).forEach(System.out::println);
        //   3. How to find duplicate elements in a given integers list in java using Stream functions?
    }

    public static void findFirstElementInIntegers() {
        List<Integer> integerList = Arrays.asList(10, 15, 11, 1, 8, 8, 1, 49, 25, 98, 32);
        integerList.stream().findFirst().ifPresent(System.out::println);
        // 4. Given the list of integers, find the first element of the list using Stream functions?


    }

    public static void totalNumberInList() {
        List<Integer> integerList = Arrays.asList(10, 15, 11, 1, 8, 8, 1, 49, 25, 98, 32);
        long count = integerList.stream().count();
        System.out.println(count);
        //  5. Given a list of integers, find the total number of elements present in the list using Stream functions?
    }

    public static void getMaxValueInList() {
        List<Integer> integerList = Arrays.asList(10, 15, 11, 1, 8, 8, 1, 49, 25, 98, 32);
        integerList.stream().max(Integer::max).get();
        //    6. Given a list of integers, find the maximum value element present in it using Stream functions?
    }

    public static void getFirstNonRepeatedCharacter() {
        String input = "Java articles are Awesome";
        Character result = input.chars() // Stream of String
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entrty -> entrty.getValue() == 1l).map(entry -> entry.getKey()).findFirst().get(); //Store the chars in map with count
        System.out.println("result:::" + result);
//7. Given a String, find the first non-repeated character in it using Stream functions?
    }

    public static void getFirstRepeated() {
        String input = "Java Articles are Awesome";
        Character character = input.chars().mapToObj(ch -> Character.toLowerCase(Character.valueOf((char) ch))).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1l).map(entry -> entry.getKey()).findFirst().get();

        // input.chars().
        System.out.println("character:::" + character.toString());
//8. Given a String, find the first repeated character in it using Stream functions?
    }

    public static void sortingTheList() {
        List<Integer> list = Arrays.asList(34, 12, 45, 32, 89, -4);

        List<Integer> integerList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("comparingint::" + integerList.toString());

        List<Integer> integerList1 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("inascending order:::" + integerList1.toString());

        List<String> names = Arrays.asList("James", "Mary", "Ken", "Joe");
        List<String> reversed = names.stream() .sorted(Comparator.reverseOrder()) .collect(Collectors.toList());
        System.out.println("reversed order:::" + reversed.toString());


    }
    public static void returnTrueFalseIfListContainsDuplicate()
    {
      //  11. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

        int[] arrint=new int[]{2,4,12,56,34,34};
boolean isSimiliar=false;
        List<Integer> list = Arrays.stream(arrint)
                .boxed()
                .collect(Collectors.toList());
        Set<Integer> set = new HashSet<>(list);
        if(set.size() == list.size()) {
             isSimiliar=false;
        }else
         isSimiliar=true;

        System.out.println("issimiliar true::::"+isSimiliar);
    }
public static void concateTwoStream()
{
    List<String> list1 = Arrays.asList("Java", "8");
    List<String> list2 = Arrays.asList("explained", "through", "programs");

   List<String> combineStream= Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());

   System.out.println(combineStream.toString());

}
public static  void cubeAndFilter()
{
   // 14. Java 8 program to perform cube on list elements and filter numbers greater than 50.
    List<Integer> integerList=Arrays.asList(4,5,6,7,1,2,3);
  List<Integer> list =  integerList.stream().map(i->i*i*i).filter(i->i>50).collect(Collectors.toList());
  System.out.println(list.toString());
}
public static void sortAndConvertIntoStream()
{
   // 15. Write a Java 8 program to sort an array and then convert the sorted array into Stream?
  //  List<Integer> integerList=Arrays.asList(4,5,6,7,1,2,3);

    int arr[] = { 99, 55, 203, 99, 4, 91 };
    Arrays.sort(arr);
    Arrays.stream(arr).forEach(System.out::println);
//convert String into uppercase
    List<String> arraysList=Arrays.asList("hello","how","are","you");

  List<String> upperList=  arraysList.stream().map(String::toUpperCase).collect(Collectors.toList());

  System.out.println(upperList.toString());


}
    }



