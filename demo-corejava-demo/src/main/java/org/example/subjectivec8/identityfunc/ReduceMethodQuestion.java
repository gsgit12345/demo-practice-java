package org.example.subjectivec8.identityfunc;

import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class ReduceMethodQuestion {
    public static void main(String str[])
    {
        //createCollector();
        combineTwoValueFromListOfObjectIntoMap();
    }

    public static void createCollector()
    {
        //We would like to know how to create collector from supplier, accumulator, combiner and finisher.
        List<RealTimeEmployee> employeeList=   RealTimeEmployeeQuestion.loadEmployee();

        Collector<RealTimeEmployee, StringJoiner, String> personNameCollectorSupplier =
                Collector.of(
                        () -> new StringJoiner(" | "),          // supplier
                        (j, p) -> j.add(p.name.toUpperCase()),  // accumulator here j is stringjoiner and p is RealTimeEmployee
                        (j1, j2) -> j1.merge(j2),               // combiner
                        StringJoiner::toString);                // finisher
     String name=   employeeList.stream().collect(personNameCollectorSupplier);
     System.out.println("alll combine name is::"+name);


    }

    public static void combineTwoValueFromListOfObjectIntoMap()
    {
        List<RealTimeEmployee> employeeList=   RealTimeEmployeeQuestion.loadEmployee();

        Map<Integer, String> map = employeeList
                .stream()
                .collect(Collectors.toMap(
                        p -> p.age,
                        p -> p.name,
                        (name1, name2) -> name1 + ";" + name2));

        System.out.println("alll combine name is::"+map);

    }
}
