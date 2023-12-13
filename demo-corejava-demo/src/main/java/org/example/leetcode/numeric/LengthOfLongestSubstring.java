package org.example.leetcode.numeric;

import java.util.ArrayList;
import java.util.List;

public class LengthOfLongestSubstring {
    /*
    Given a string s, find the length of the longest
substring
 without repeating characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */
    public static void main(String str[]) {
        String s = "abcabcbb";//Output: 3
        String s1 = "bbbbb";//Output: 1
        String s2 = "pwwkew";//Output: 3

        int longestSubStringLength = longestSubString(s2);
        System.out.println("longest substring length::" + longestSubStringLength);

    }

    public static int longestSubString(String st) {
        //https://www.youtube.com/watch?v=VvS_CtSIeiQ
        //complexity space--big(n),time(big n)
        int ans = 0;
        int end = 0;
        int start = 0;
        List<Character> storeString = new ArrayList<Character>();
        while (end < st.length()) {
            if (!storeString.contains(st.charAt(end))) {
                storeString.add(st.charAt(end));
                ans = Math.max(ans, storeString.size());
                end++;

            } else {
                storeString.remove(Character.valueOf(st.charAt(start)));//here we had used Character.valueOf(ch) to avoid ArrayIndexOutOfBoundException.
                start++;                                   // It will take the ascii
            }
        }
        return ans;
    }
}
