package org.example.java8subjectiveQuestion;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8SubjectiveQuetionForInterview {
    public static void main(String str[])
    {
      //Finding even and odd number in java 8//////////////
        List<Integer> intstream=Arrays.asList(1,2,3,4,5,5,6,7,8,9,12,11,13);
        List<Integer> even=intstream.stream().filter(x->x%2!=0).collect(Collectors.toList());
        System.out.println("even numebr is::"+even);

        ////////////////Remove duplicate element from the list//////////////////
        List<Integer> duplicate=Arrays.asList(1,2,3,4,5,5,6,7,8,9,12,11,12,13,13);
        List<Integer>  removedup= duplicate.stream().distinct().collect(Collectors.toList());
        System.out.println("remove  duplicate number from list is::"+removedup);
        ////////////////////frequency of each character in string /////////////
        String string="hello I am going to java in market";
        Map<Character,Long> charfrequency=string.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        
        //////////////////freequency of ellemnt in the list///////////////////
        List<Integer> list=Arrays.asList(1,2,3,4,5,5,6,7,8,9,12,11,13);
         Map<Integer,Long> frequencyList= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
         System.out.println("frequency in list :"+frequencyList.toString());
         ///////////////////////Sort the list in reverse order//////////////////
        List<Integer> list1=Arrays.asList(1,2,3,4,5,5,6,78,8,9,12,11,13);
            List<Integer> reverse=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            System.out.println(reverse.toString());
          //////////Join the list with  delimitor,prefix,suffix//////////////
          List<Integer> list2=Arrays.asList(1,2,3,4,5,5,6,78,8,9,12,11,13);
         String joinedString = list2.stream().map(Objects::toString).collect(Collectors.joining(", ", "(", ")"));
         System.out.println("join the list::"+joinedString);
        //////////////////print the multiple of 5 in the string///////////
        List<Integer> list3=Arrays.asList(1,12,15,45,55,50,6,7,8,9,125,115,13);
        List<Integer> multiple0fnum=list3.stream().filter(x->x%5==0).collect(Collectors.toList());
        System.out.println("multiple of  the 5 or any number from the  list::"+multiple0fnum);
        //////////////////maximum and minimum in the list///////////////////
        List<Integer> list4=Arrays.asList(1,0,12,15,45,55,50,6,7,8,9,125,115,13);
        int max=list4.stream().max(Comparator.naturalOrder()).get();
        int min=list4.stream().min(Comparator.naturalOrder()).get();
        System.out.println("max is::"+max+":min is::"+min);
        /////////////////////merge two unsorted array into single array///////////
        int array1[]={33,21,67,22};
        int array2[]={30,90,57,12};
        int merged[]=IntStream.concat(Arrays.stream(array1),Arrays.stream(array2)).distinct().sorted().toArray();
        System.out.println("merged array :::"+Arrays.toString(merged));
        ////////////////find the anagram in java 8 //////////////////////////////////
        String str1="silent";
        String str2="listen";
        String str3=Stream.of(str1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        String str4=  Stream.of(str2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        System.out.println("first str::"+str3+":fourth string::"+str4);
        //String s1 = "RaceCar";
        //String s2 = "CarRace";
        if(str3.equals(str4))
        {
            System.out.println("string is anagram");
        }else {
            System.out.println("string is not anagram");
        }
        ////////////////////////////find sum of all digit in number///////////
        int num=12345678;
        Integer sumofint=Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));
         System.out.println("sum of all integer::"+sumofint);
         ///////////////////Three max and min number in the array//////////
        List<Integer> list5=Arrays.asList(1,0,2,12,15,45,55,50,6,7,8,9,125,115,13);
       List<Integer> smallerthree= list5.stream().sorted().limit(3).collect(Collectors.toList());
       System.out.println("smaller three number in the list::"+smallerthree.toString());
        List<Integer> biggerNum= list5.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println("bigger three number in the list::"+biggerNum.toString());
//////////////////////////N th largest number in the List and n th minimum///////////////
        List<Integer> list6=Arrays.asList(1,0,2,12,15,45,55,50,6,7,8,9,125,115,13);
      Integer secondLargest=   list6.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
      System.out.println("secondlargest is:::"+secondLargest);
        Integer nthminimum=   list6.stream().sorted().skip(1).findFirst().get();
        System.out.println("second minimum  is:::"+nthminimum);
        //////////////////////sort list of string in increasing order by string length/////////////////
       List<String>  list7= Arrays.asList("hello","hi","howare","whereareyougoing","and","i");
       List<String> sortedString=   list7.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
       System.out.println("sortedString by length::"+sortedString.toString());
       //////////////////Find the comman element between two list///////////
        List<Integer> list8=Arrays.asList(2,3,2,1,3,4);
        List<Integer> list9=Arrays.asList(22,3,2,11,3,4);
        List<Integer> list10=list8.stream().filter(x->list9.contains(x)).distinct().collect(Collectors.toList());
        System.out.println("comman element between two element:::"+list10.toString());
        ///////////////Sum and average of the array /////////////////
        int array3[]={10,1,6,2};
       double average= Arrays.stream(array3).average().getAsDouble();
       System.out.println("average is:::"+average);
       Integer sum= Arrays.stream(array3).sum();
        System.out.println("sum is:::"+sum);
        /////////reverse each word of a string/////////////////
        String string1="hello i am going to the market";
       List<String> reverseword= Arrays.stream(string1.split(" ")).map(st->new StringBuilder(st).reverse().toString()).collect(Collectors.toList());
        System.out.println("reverse  each word in string ::"+reverseword);













    }
}
