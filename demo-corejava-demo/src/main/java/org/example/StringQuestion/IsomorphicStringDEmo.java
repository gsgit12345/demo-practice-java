package org.example.StringQuestion;

import java.util.Arrays;
import java.util.HashMap;

public class IsomorphicStringDEmo {

    public static void main(String str[])
    {
        //Check if two given Strings are Isomorphic to each other
       // Two strings str1 and str2 are called isomorphic if there is a one-to-one mapping possible for every character of str1 to
        //every character of str2. And all occurrences of every character in ‘str1’ map to the same character in ‘str2’.
     //   Input:  str1 = “aab”, str2 = “xxy”
       // Output: True
       // Explanation: ‘a’ is mapped to ‘x’ and ‘b’ is mapped to ‘y’.

        //Input:  str1 = “aab”, str2 = “xyz”
        //Output: False
        //Explanation: One occurrence of ‘a’ in str1 has ‘x’ in str2 and other occurrence of ‘a’ has ‘y’.

String source="aab";
String target="xxy";
//negative
        String source1="aab";
        String target1="xyz";
      boolean isomorphic=  isIsomorphicString(source1,target1);
      System.out.println("string is isomorphic::"+isomorphic);
    }
    public static boolean isIsomorphicString(String source,String target)
    {
        //Time Complexity: O(N), traversing over the string of size N.
        //Auxiliary Space: O(1)
        //https://www.youtube.com/watch?v=6Qkail843d8    --video link
        //steps to be executed
        //1-check the length of both string.if length is not equal then return false
        //2-Take two HashMap.first hashmap would be used for storing isomorphic string.second hashmap would be <char,boolean>type.it would be used to store that second
        //character has been used in first hashmap with the first character or not.if it used then we will store it in second hashmap and will put true against it.
        //3-start a loop  from 0 to sourcestring.length and take two variable like char ch1=source.charAt[i]  and ch2=target.charAt[i]
        //4-first check in if(map1.containesKey(ch1)==true) .it means first character available in the map1 as key.within this if condition
        //take one if condition like map2.get(ch1(character from source string)) !=ch2) then return false.this condition would be in loop.
        //in else part check if(map2.containsKey(ch2)==true) then return false else store in map1.put(ch1,ch2) and in map2.put(ch2,true)
        //end the loop
        //from method return the true.
        if(source.length()!=target.length())
            return false;
        HashMap<Character,Character> storeIsomorpic=new HashMap<Character,Character>();
        HashMap<Character,Boolean> isalreadyUsed=new HashMap<Character,Boolean>();
        for(int i=0;i<source.length();i++)
        {
            char firstChar=source.charAt(i);
            char usedChar=target.charAt(i);
            if(storeIsomorpic.containsKey(firstChar)==true)
            {
                if(storeIsomorpic.get(firstChar)!=usedChar)
                    return false;
            }else
            {
                if(isalreadyUsed.containsKey(usedChar)==true) {
                    return false;
                }else {
                    storeIsomorpic.put(firstChar,usedChar);
                    isalreadyUsed.put(usedChar,true);
                }
            }
        }
        return true;
    }
    static boolean areIsomorphic(String str1, String str2)
    {

        HashMap<Character, Character> charCount
                = new HashMap<Character,Character>();
        char c = 'a';
        for (int i = 0; i < str1.length(); i++) {
            if (charCount.containsKey(str1.charAt(i))) {
                c = charCount.get(str1.charAt(i));
                if (c != str2.charAt(i))
                    return false;
            }
            else if (!charCount.containsValue(
                    str2.charAt(i))) {
                charCount.put(str1.charAt(i),
                        str2.charAt(i));
            }
            else {
                return false;
            }
        }
        return true;
    }
    static String areIsomorphic2(String str1, String str2)
    {
         int size = 256;

        int m = str1.length();
        int n = str2.length();

        // Length of both strings must be same for one to
        // one correspondence
        if (m != n)
            return "False";

        // To mark visited characters in str2
        Boolean[] marked = new Boolean[size];
        Arrays.fill(marked, Boolean.FALSE);

        // To store mapping of every character from str1 to
        // that of str2. Initialize all entries of map as
        // -1.
        int[] map = new int[size];
        Arrays.fill(map, -1);

        // Process all characters one by one
        for (int i = 0; i < n; i++) {
            // If current character of str1 is seen first
            // time in it.
            if (map[str1.charAt(i)] == -1) {
                // If current character of str2 is already
                // seen, one to one mapping not possible
                if (marked[str2.charAt(i)] == true)
                    return "False";

                // Mark current character of str2 as visited
                marked[str2.charAt(i)] = true;

                // Store mapping of current characters
                map[str1.charAt(i)] = str2.charAt(i);
            }

            // If this is not first appearance of current
            // character in str1, then check if previous
            // appearance mapped to same character of str2
            else if (map[str1.charAt(i)] != str2.charAt(i))
                return "False";
        }

        return "True";
    }

}
