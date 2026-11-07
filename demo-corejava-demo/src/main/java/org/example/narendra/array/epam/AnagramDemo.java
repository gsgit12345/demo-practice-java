package org.example.narendra.array.epam;

import java.util.HashMap;

public class AnagramDemo {
    public static void main(String str[]) {
        String st1 = "anagram";
        String st2 = "nagaram";

        String st3 = "rat";
        String st4 = "car";
        boolean b = isAnagram(st3, st4);
        if (b) {
            System.out.println("string is anagram::" + b);
        } else {
            System.out.println("string is not anagram::" + b);

        }
      boolean b1=  isAnagram2(st3,st4);
        if(b1)
        {
            System.out.println("string is anagram ");
        }else
        {
            System.out.println("string is not anagram ");

        }
    }

    public static boolean isAnagram(String str, String str2) {
        if (str.length() != str2.length())
            return false;

        HashMap<Character, Integer> charHashmap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            charHashmap.put(ch, charHashmap.getOrDefault(ch, 0) + 1);
        }
        for (char ch : str2.toCharArray()) {
            if (!charHashmap.containsKey(ch)) {
                return false;

            }
            if (charHashmap.get(ch) == 1) {
                charHashmap.remove(ch);
            } else {
                charHashmap.put(ch, charHashmap.getOrDefault(ch, 0) - 1);
            }
        }
        System.out.println(charHashmap.toString());
        return charHashmap.isEmpty() ? true : false;
    }

    public static boolean isAnagram2(String st, String st1) {
        if (st.length() != st1.length())
            return false;

        int count[] = new int[26];
        for (int i = 0; i < st.length(); i++) {
            count[st.charAt(i) - 'a']++;
        }
        for (int i = 0; i < st1.length(); i++) {
            count[st1.charAt(i) - 'a']--;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
    public void printGroupAnagram(String arr[])
    {

    }
}
