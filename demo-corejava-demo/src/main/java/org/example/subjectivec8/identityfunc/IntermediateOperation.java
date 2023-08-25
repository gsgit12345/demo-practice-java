package org.example.subjectivec8.identityfunc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperation {
    public static void main(String str[]) throws IOException {
       // peekMethod();
       // sortListUsingLambda();
      //  sortestToLongest();
        //countAfterFilter();
        FilterListAndAssignBack();
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
        //The following code shows how to get max value after partition.
/*

        List<RealTimeEmployee> employeeList=   RealTimeEmployeeQuestion.loadEmployee();
        employeeList.stream().collect(
                Collectors.partitioningBy(RealTimeEmployee::isVegetarian,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingInt(Food::getCalories)),
                                Optional::get)));
        System.out.println(o);
*/


        List<Graduate> studentGraduate=   loadStudentGraduate();

        boolean milanBased =
                studentGraduate.stream()
                        .anyMatch(transaction -> transaction.getTrader().getCity()
                                .equals("Milan"));
System.out.println("milanBased student:::"+milanBased);

    }
    public static void countAfterFilter() throws IOException {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

   long total=     stringCollection.stream().filter(s->s.startsWith("a")).count();
   System.out.println("total::"+total);

//walk the file and walk Java Filter each line in text file and count
        Path start = Paths.get("/home/iid/project/demo-practice-java/demo-corejava-demo/src/main/resources/employees.json");
        int maxDepth = 2;
        long fileCount =
                Files
                        .walk(start, maxDepth)
                        .filter(path -> String.valueOf(path).endsWith("Developer"))
                        .count();
        System.out.format("XLS files found: %s", fileCount);

    }

    public static void FilterListAndAssignBack()
    {
        //We would like to know how to filter elements in List and assign back.
        List<String> argList = Arrays.asList("help", "v");

        Predicate<String> isHelp = (s) -> s.matches("(h|help)");
System.out.println(isHelp.negate().test("v"));
        argList = argList.stream().filter(isHelp.negate())
                .collect(Collectors.toList());

        System.out.println(argList);
      //  We would like to know how to filter Empty String value.

        List<String> names = Arrays.asList("Chris", "HTML", "XML", "CSS","");

        Stream<String> s = names.stream();
        Stream<String> s1 = names.stream();

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> notEmpty = isEmpty.negate();
//filtering the space or empty string in list
        System.out.println(s.filter(x->!x.isEmpty()).collect(Collectors.toList()));

        System.out.println(s1.filter(isEmpty).collect(Collectors.toList()));

        List<String> names1 = Arrays.asList("Chris", "HTML", "XML", "CSS","",null);

//removing the null  value from the list of object
        List<String> collect = names1.stream().filter(Objects::nonNull).filter(name -> name.startsWith("C")).collect(Collectors.toList());
        System.out.println(collect);


    }
public static List<Graduate> loadStudentGraduate()
{

    StudentGraduate raoul = new StudentGraduate("Raoul", "Cambridge");
    StudentGraduate mario = new StudentGraduate("Mario","Milan");
    StudentGraduate alan = new StudentGraduate("Alan","Cambridge");
    StudentGraduate brian = new StudentGraduate("Brian","Cambridge");

    List<Graduate> transactions = Arrays.asList(
            new Graduate(brian, 2011, 300),
            new Graduate(raoul, 2012, 1000),
            new Graduate(raoul, 2011, 400),
            new Graduate(mario, 2012, 710),
            new Graduate(mario, 2012, 700),
            new Graduate(alan, 2012, 950)
    );

return transactions;
}

}

