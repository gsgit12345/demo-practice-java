package org.example.narendra.array;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharInString {
    public static void main(String str[]) {
        String st = "hello i am going to market";
        //e,l,o,a,m,
        findDuplicateCharInString(st);
    }

    public static void findDuplicateCharInString(String st) {

        Map<Character, Integer> hash = st.chars().mapToObj(c -> (char) c).
                collect(Collectors.toMap(Function.identity(), e -> 1, Math::addExact));
        System.out.println("hello::" + hash.toString());

        for (Character mm : hash.keySet()) {
            if (hash.get(mm) > 1) {
                System.out.print(mm);
            }
        }

    }
}
