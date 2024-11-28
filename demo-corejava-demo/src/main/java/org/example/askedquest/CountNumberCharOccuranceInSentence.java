package org.example.askedquest;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNumberCharOccuranceInSentence {
    public static void main(String str[]) {
        String st = "my name is ghanshyam";

        Map<Character, Integer> result = countCharOccurance(st);
        // System.out.println(result.toString());

        Map<Character, Long> countmp = countCharOccuranceinStringUsingJava8(st);
        System.out.println(countmp.toString());

    }

    public static Map<Character, Long> countCharOccuranceinStringUsingJava8(String str) {

        Map<Character, Long> count = str.chars().mapToObj((a -> (char) a)).collect(Collectors.
                groupingBy(Function.identity(), Collectors.counting()));

        // Optional<Character> op= count.keySet().stream().max(Comparator.comparing(Character::charValue));

        // System.out.println(op.get());
        return count;
    }

    public static Map<Character, Integer> countCharOccurance(String str) {
        Map<Character, Integer> countMap = new HashMap<>();
        //  int count=0;
        String st = "my name is ghanshyam";
        //{ =3, a=3, s=2, e=1, g=1, h=2, y=2, i=1, m=3, n=2}
        //in ouput firstone is the space.
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (countMap.containsKey(ch)) {
                int count = countMap.get(ch);
                count += 1;
                countMap.put(ch, count);
            } else {
                countMap.put(ch, 1);

            }
        }
        char chh = str.charAt(0);
        for (Character key : countMap.keySet()) {
            if (countMap.get(key) > countMap.get(chh)) {
                chh = key;
            }
        }

        System.out.println("max ix ::" + chh+":value:"+countMap.get(chh));
        return countMap;
    }


}
