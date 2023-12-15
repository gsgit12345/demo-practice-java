package org.example.leetcode.numeric;

public class ReverseInteger {
    /*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
Example 1:
Input: x = 123
Output: 321
Example 2:
Input: x = -123
Output: -321
Example 3:
Input: x = 120
Output: 21

     */
    public static void main(String str[])
    {
        int x = 123 ;//ans-321;
        int x1 = -123;//ans: -321;
        int x2 = 120;//21;
        int ans=  reverseNumber(x2);
        System.out.println("ans is ::"+ans);

    }
    public static int reverseNumber(int num)
    {
        boolean isNegative=false;
        if(num<0)
        {
            isNegative=true;
        }
        num=Math.abs(num);
        int reverseNum=0;
        int mode=0;
        while(num>0)
        {
            mode=num%10;
            reverseNum=reverseNum*10+mode;
            num=num/10;
        }
        //handle the overflow integer
        if(reverseNum>Integer.MAX_VALUE/10)
            return 0;
        return isNegative ? -reverseNum : reverseNum;
    }
    //TC-big(n^2)
    //ST-big(1)
}
