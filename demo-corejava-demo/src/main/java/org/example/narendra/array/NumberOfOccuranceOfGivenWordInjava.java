package org.example.narendra.array;

import java.util.Arrays;
import java.util.List;

public class NumberOfOccuranceOfGivenWordInjava {
    public static void main(String str[]) {
        List<String> strings = Arrays.asList("java scala ruby", "java react spring java", "java is pretty");
        String word = "java";

        long occ = strings.stream().flatMap(a -> Arrays.stream(a.split(" "))).filter(b -> b.equals(word)).count();
        System.out.println(occ);
        filterStringByPrefix();
    }

    public static void filterStringByPrefix() {
        String[] strings = {"java", "scala", "javascript", "ruby", "spring", "angular"};
        String prefix = "j";
        long l = Arrays.stream(strings).filter(a -> a.startsWith(prefix)).count();
        System.out.println(l);

    }
}
