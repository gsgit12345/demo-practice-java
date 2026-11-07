package org.example.narendra.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RevesrAstring {
    public static void main(String str[]) {
        String kk = "ghanshyam";
        String rev = reverseString(kk);

        //  System.out.println(rev);
        String rev2 = reverseStringInJava8(kk);
        System.out.println(rev2);
    }

    public static String reverseStringInJava8(String str) {
        String stt = str.chars().mapToObj(a -> (char) a).reduce("", (a, b) -> b + a, (a2, b2) -> b2 + a2);

      char charArray[]=  str.toCharArray();
        StringBuilder ddd= IntStream.range(0,str.length()).mapToObj(i->charArray[str.length()-i-1]).
              collect(StringBuilder::new,StringBuilder::append,StringBuilder::append);

        System.out.println(ddd);
        return stt;
    }

    public static String reverseString(String str) {
        if (str == null || str.length() == 1)
            return str;

        String dd = reverseString(str.substring(1)) + str.charAt(0);
        return dd;
    }
}
