package org.example.narendra.array;

import java.util.Arrays;

public class CountTheGivenCharacterInString {
    public static void main(String str[]) {
        String st = "hello i am going to market";
        char ch = 'o';

        countOccuranceOfCharInString(st, ch);
    }

    public static void countOccuranceOfCharInString(String st, char c) {
        long count = st.chars().mapToObj(a -> (char) a).filter(a -> a == c).count();
        System.out.println("count::" + count);
    }
}
