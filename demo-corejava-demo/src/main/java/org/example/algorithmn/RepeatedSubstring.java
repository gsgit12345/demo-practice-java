package org.example.algorithmn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RepeatedSubstring {

public static void main(String str[])
{
	String sss="ABCACBABC";
	 Map<String, Integer> output=	findOccurences(sss,2);
	 
	 System.out.println(output.toString());
}

public static  Map<String, Integer> findOccurences(String str, int length) {
    Map<String, Integer> map = new HashMap<>();
    int limit = str.length() - length + 1;
    for (int i = 0; i < limit; i++) {
        String sub = str.substring(i, i + length);
        Integer counter = map.get(sub);
        if (counter == null) {
            counter = 0;
        }
        map.put(sub, ++counter);
    }
    return map;
}
}
