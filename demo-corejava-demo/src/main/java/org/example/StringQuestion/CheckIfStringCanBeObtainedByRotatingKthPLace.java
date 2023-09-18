package org.example.StringQuestion;

import java.util.Arrays;

public class CheckIfStringCanBeObtainedByRotatingKthPLace {
    public static void main(String str[]) {
        String string1 = "amazon";
        String string2 = "onamaz";
        String third = "onamaz";
        int kth = 2;
        boolean result = rotateStringLeftRightAndstr2IsEqualToStr1(string1, third, kth);
        if (result) {
            System.out.println("yes");
        } else {
            System.out.println("false");
        }
        boolean result2=   rotateStringLeftRightAndstr2IsEqualToStr1Second(string1, third, kth);
        if (result2) {
            System.out.println("yes");
        } else {
            System.out.println("false");
        }
    }

    public static boolean rotateStringLeftRightAndstr2IsEqualToStr1(String st1, String str2, int kth) {
        //Time Complexity – O(n), Iterating over the string 2 times for comparing both the strings.
        //Space Complexity – O(n)
        //https://www.youtube.com/watch?v=8fK-cN1uvqc
        //Check if strings can be derived from each other by circularly rotating them
        //Check if a string can be obtained by rotating another string 2 places

        int length = st1.length();
        char left[] = new char[length];
        char right[] = new char[length];
        boolean result = false;
        System.out.println(str2);
        //1-left rotation or anticlockwise rotation or forward direction
        if (st1 == null || str2 == null && st1.length() != str2.length())
            return false;
        for (int i = 0; i < length; i++) {
            left[i] = st1.charAt((i + kth) % length);
        }
        //right rotation or clockwise rotation
        for (int i = 0; i < length; i++) {
            right[i] = st1.charAt((length - kth + i) % length);
        }
        String stleft = new String(left);
        String stright = new String(right);

        System.out.println("left rotation::" + stleft);
        System.out.println("left rotation::" + stright);
        if (stright.equalsIgnoreCase(str2)) {
            result = true;
        } else if (stleft.equalsIgnoreCase(str2)) {

            result = true;
        } else {
            result = false;
        }

        return result;

    }
    public static boolean rotateStringLeftRightAndstr2IsEqualToStr1Second(String st1, String str2, int kth)
    {
      //  Time Complexity – O(n), Iterating over the string 2 times for comparing both the strings.
        //Space Complexity – O(1)

        int n = st1.length();
        int m = str2.length();
        if (n != m) //check both the string length equal or not
            return false;
        boolean clockwise = true;
        boolean anticlockwise = true;
        //check clockwise rotation is possible or not
        for (int i = 0; i < n; i++) {
            if (st1.charAt(i)!= str2.charAt((i + kth) % n)) {
                clockwise = false;
                break;
            }
        }
        // check anticlockwise rotation is possible or not
        for (int i = 0; i < m; i++) {
            if (st1.charAt((i + kth) % n)!= str2.charAt(i)) {
                anticlockwise = false;
                break;
            }
        }
        return (clockwise || anticlockwise);
    }
    // function that rotates s towards left by d
    static String leftrotate(String str, int d)
    {
        String ans = str.substring(d) + str.substring(0, d);
        return ans;
    }

    // function that rotates s towards right by d
    static String rightrotate(String str, int d)
    {
        return leftrotate(str, str.length() - d);
    }





}
