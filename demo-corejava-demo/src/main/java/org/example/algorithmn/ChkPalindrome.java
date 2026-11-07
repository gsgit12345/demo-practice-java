package org.example.algorithmn;

class ChkPalindrome {
    public static void main(String args[]) {
        String str, rev = "";
        str = "ntpc";
        int length = str.length();
        String s = "level";

        System.out.println("string is::"+isStringPalindrom(s));
        for (int i = length - 1; i >= 0; i--)
            rev = rev + str.charAt(i);

        if (str.equals(rev))
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome");
        String st = "madam";

        if (isStringPalindrom(st)) {
            System.out.println(st + " is a palindrome");

        } else {
            System.out.println(st + " is not a palindrome");

        }

    }

    public static boolean isPalindrome(String str) {
        int length = str.length();
        if (length == 0)
            return true;
        return false;
    }

    public static boolean palindromUsingRecursion(String str, int start, int end) {
        return false;
    }

    public static boolean isStringPalindrom(String s1) {
        //big(n)
        //space big(1)
        int i = 0;
        int j = s1.length() - 1;

        while (i < j) {
            if (s1.charAt(i) != s1.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}