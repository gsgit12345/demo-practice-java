package org.example.subjectivec8.identityfunc;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String str[]) {
        //listToMap();
        //sortingMapByKeyOrValue();
        //   convertListIntoMapWithDuplicateKey();
        // countWordInString();
        // countDuplicateWithCount();
        //  removeNullObjectFromList();
        countCharacterInStringAndWord();
    }

    public static void listToMap() {
        List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
        List<Integer> sortedList = list.stream()
                .sorted((i1, i2) -> i2.compareTo(i1))
                .collect(Collectors.toList());
        System.out.println(sortedList);
        List<String> stringList = Arrays.asList("visa", "mastercard", "visha", "icici card", "hdfccard", "mastercard");
        //Map <String, Integer> stringIntegerHashMap= stringList.stream().collect(Collectors.toMap(Function.identity(),String::length));
//above code will throw  Exception in thread "main" java.lang.IllegalStateException: Duplicate key 10
        // System.out.println("stringIntegerHashMap::;"+stringIntegerHashMap.toString());
        Map<String, Integer> stringIntegerHashMap = stringList.stream().collect(Collectors.toMap(Function.identity(), String::length, (e1, e2) -> e1));
        //above code solves the above problem here we hade given (e1,e2)->e1 then we are selecting the first element from the list
        System.out.println("stringIntegerHashMap::;" + stringIntegerHashMap.toString());
        //map does not maintain the order if we want to maintain the order we have to use fourth parameter in toMap()
        Map<String, Integer> ordered = stringList.stream().collect(Collectors.toMap(Function.identity(), String::length, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("ordered::;" + ordered.toString());

    }

    public static void sortingMapByKeyOrValue() {
        HashMap<Integer, Employee> employeeHashMap = loadObject();
        Map<Integer, Employee> sortedemployee1 = employeeHashMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(sortedemployee1.toString());

        ////sorting the map by key only
        Map<Integer, Employee> dortedbykey = employeeHashMap.entrySet().stream().sorted(Map.Entry.<Integer, Employee>comparingByKey()).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("sorting by key map of object::" + dortedbykey.toString());

        Comparator<Employee> byname = Comparator.comparing(Employee::getEmployeeName);

        Map<Integer, Employee> dortedbybyvalu = employeeHashMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getSalary))).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("comparing by value with salary::" + dortedbybyvalu.toString());

        Map<Integer, Employee> sortbyname = employeeHashMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getEmployeeName))).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("comparing by value with sortbyname::" + sortbyname.toString());


    }

    public static void convertListIntoMapWithDuplicateKey() {
        List<Notes> notesList = loadNotes();
        LinkedHashMap linkedHashMap = notesList.stream().collect(Collectors.toMap(Notes::getTagName, Notes::getTagId, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("" + linkedHashMap);
        LinkedHashMap<String, Integer> sorted = notesList.stream().sorted(Comparator.comparing(Notes::getTagId).reversed()).
                collect(Collectors.toMap(e -> e.getTagName(), e -> e.getTagId(), (first, second) -> first, LinkedHashMap::new));

        System.out.println("sortedmap::" + sorted.toString());
    }

    public static void countWordInString() {
        //18. How to count each element/word from the String ArrayList in Java8?
        String st = "hello i am going to the market am i";
        String arr[] = st.split(" ");
        HashMap<String, Long> map = (HashMap<String, Long>) Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //hh:{market=1, the=1, going=1, i=2, to=1, hello=1, am=2}
        System.out.println("hh:" + map);
    }

    public static void countDuplicateWithCount() {
        //19. How to find only duplicate elements with its count from the String ArrayList in Java8?
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String, Long> duplicate = names.stream().filter(x -> Collections.frequency(names, x) > 1).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //hh:{AA=2}
        System.out.println("hh:" + duplicate);
    }

    public static void removeNullObjectFromList() {
        //20. How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?
        List<Notes> notesList = loadNotes();

        List<String> list = Optional.ofNullable(notesList).orElseGet(Collections::emptyList).stream().
                filter(Objects::nonNull).map(x -> x.getTagName()).collect(Collectors.toList());


        System.out.println("without null::" + list.toString());


        List<Notes> list3 = notesList
                // creates empty immutable list: [] in case noteLst is null
                .stream().filter(Objects::nonNull) //loop throgh each object and consider non null objects
                // .map(n->n.getTagName()) // method reference, consider only tag name
                .collect(Collectors.toList()); // it will print tag names

        System.out.println("without newList null::" + list3.toString());

        List<String> list2 =
                new ArrayList<>(Arrays.asList("A", null, "B", null));

        List<String> newList = list2.stream().filter(Objects::nonNull)
                .collect(Collectors.toList());

        System.out.println("without newList null::" + newList.toString());

    }

    public static void countCharacterInStringAndWord() {
        String str = "hello where you are going to market";
        Map<String, Long> countWordinString = Arrays.stream(str.split(" ")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println("count map::" + countWordinString.toString());
        //count map::{hello=1, where=1, you=1, are=1, going=1, to=1, market=1}
        //note:-above code is counting the oocurance of the word in string.IT happens due to we are splitting the string by space.
        Map<String, Long> countcharacterinString = Arrays.stream(str.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println("count character map::" + countcharacterinString.toString());
        //count character map::{h=2, e=5, l=2, o=4,  =6, w=1, r=3, y=1, u=1, a=2, g=2, i=1, n=1, t=2, m=1, k=1}
    }

    public static HashMap<Integer, Employee> loadObject() {
        HashMap<Integer, Employee> hashMap = new <Integer, Employee>HashMap();
        hashMap.put(12301, new Employee(12301, "Abhay", "It", 10000));
        hashMap.put(12302, new Employee(12302, "manish", "HR", 12000));
        hashMap.put(10009, new Employee(10009, "fatima", "Finance", 14000));
        hashMap.put(11304, new Employee(11304, "sam", "Travell", 13000));
        hashMap.put(12305, new Employee(12305, "frank", "Admin", 20000));

        return hashMap;
    }

    public static List<Notes> loadNotes() {
        List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "note1", 11));
        noteLst.add(new Notes(2, "note2", 22));
        noteLst.add(new Notes(3, "note3", 33));
        noteLst.add(new Notes(4, "note4", 44));
        noteLst.add(new Notes(5, "note5", 55));
        noteLst.add(null);
        noteLst.add(null);

        noteLst.add(new Notes(6, "note4", 66));
        return noteLst;

    }
}
