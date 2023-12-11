package org.example.leetcode.matrix.stringquest;

public class RotateString {
public static void main(String str[])
{
/*
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
A shift on s consists of moving the leftmost character of s to the rightmost position.
For example, if s = "abcde", then it will be "bcdea" after one shift.
Example 1:
Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:
Input: s = "abcde", goal = "abced"
Output: false
 */
    String source="abcde";
    String goal="cdeab";
    String source1="abcde";
    String goal1="abced";
  boolean contain=  rotateString(source1,goal1);
  System.out.println("output::"+contain);
}
public static boolean rotateString(String source,String goal)
{
    return source.length()==goal.length() && (source+source).contains(goal);
}
}
