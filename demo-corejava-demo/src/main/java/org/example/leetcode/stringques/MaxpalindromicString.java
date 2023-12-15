package org.example.leetcode.stringques;

/*
Given a string s, return the longest
palindromic
substring
 in s.
Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 */
public class MaxpalindromicString {
    //https://www.youtube.com/watch?v=AKIHWGumagI
//https://www.youtube.com/watch?v=QfZvw8_jz1w

    public static void main(String str[])
    {
        String Input= "babad"; //ans:-aba
        String Input1=  "cbbd"; //ans:-bb
        String longPalindrom= longestPalindrom(Input1);
       System.out.println("output:::"+longPalindrom);

    }
    public static String longestPalindrom(String s)
    {
        //approach expand from centre
        //complexity -- TC:-big(o^2) ,St-big(1)
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++)
        {
            int evenLen=lengthOfEvenString(s,i,i+1);
            int oddLen=lengthOfEvenString(s,i,i);
            int maxLen=Math.max(evenLen,oddLen);
            if(end-start<maxLen)
            {
                start=i-(maxLen-1)/2;
                end=i+maxLen/2;
            }

        }
        return s.substring(start,end+1);
    }
    static int  lengthOfEvenString(String s,int i,int j)
    {
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j))
        {
            i--;
            j++;
        }
        return j-i-1;
    }
}
