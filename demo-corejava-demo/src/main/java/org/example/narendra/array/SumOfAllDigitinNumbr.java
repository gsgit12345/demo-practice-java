package org.example.narendra.array;

public class SumOfAllDigitinNumbr {
    public static void main(String str[]) {
        int num = 12345;

        int re = sumDigit(num);
        System.out.println(re);

      int result=  sumDigitLeetCode258(num);
        System.out.println(result);
    }

    public static int sumDigitLeetCode258(int num) {
/*
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2
Since 2 has only one digit, return it.
ans ==2

 */

        num=num-1;//37
        num=num%9;
      return num+1;
      //  return 1 + (num - 1) % 9;


    }

    public static int sumDigit(int num) {
        int sum = 0;
        while (num > 0) {
            int mod = num % 10;
            sum = sum + mod;
            num = num / 10;
        }

        return sum;
    }
}
