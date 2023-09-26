package org.example.stringandarrayquestion;

import java.util.HashMap;

public class LonestSubstringWithoutRepeatingCharacter {
    public static void main(String str[])
    {
        String st="abcabcbb";
        longestSubstringWithoutRepeatingCharacter(st);
    }
    public static void longestSubstringWithoutRepeatingCharacter(String str)
    {
        HashMap<Character,Integer> frequencyMap =new HashMap<>();

        int max=0;
        int i=0;
        int j=0;
        while(j<str.length()) {
            if (!frequencyMap.containsKey(str.charAt(j))) {
                frequencyMap.put(str.charAt(j), frequencyMap.getOrDefault(str.charAt(j),0) + 1);
                if (frequencyMap.size() > max) {
                    max = frequencyMap.size();
                }
j++;
            }else {
                frequencyMap.remove(str.charAt(i));
                i++;
            }
        }
        System.out.println("max substring is::"+max);
    }
}
