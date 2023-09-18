package org.example.StringQuestion;

import java.util.Arrays;
import java.util.HashMap;

public class TwoStringIsKAnagramOrNot {
    public static void main(String str[])
    {
      String   str1 = "Grab";
      String  str2 = "Brag";
        String  negative = "Brdg";

      boolean isanagram=  isStringTwoStringAnagram(str1,str2);
      if(isanagram)
      {
          System.out.println("string is anagram");
      }else {
          System.out.println("string is not anagram");
      }

        String  str3 = "anagram" ;
                String str4 = "grammar" ;
                   int     k = 3 ;

     boolean iskthanagram=   isStringKthAnagram(str3,str4,k);

     System.out.println("is string kth anagram::"+iskthanagram);

    }

    public static boolean isStringKthAnagram(String st1,String st2,int kth) {
      //  Time Complexity: O(N)
       // Auxiliary Space: O(N), since we are using a frequency map.

        if(st1.length()!=st2.length())
            return false;
        HashMap<Character,Integer> frequency=new HashMap<>();
        for(int i=0;i<st1.length();i++) {
            char ch=st1.charAt(i);
            if(frequency.containsKey(ch)) {
                frequency.put(ch,frequency.getOrDefault(ch,0)+1);
            }
        }
        //here we are getting the value against char if present and decresing the presense count in hashmap
        for(int i=0;i<st2.length();i++) {
            char ch2=st2.charAt(i);
            if(frequency.getOrDefault(ch2,0)>0) {
                frequency.put(ch2,frequency.get(ch2)-1);
            }
        }
        int count=0;
        for(char ch:frequency.keySet()) {
            count+=frequency.get(ch);
        }
        if(count<kth)
            return true;
        else
            return false;
    }

    public static boolean isStringTwoStringAnagram(String a,String b)
    {
       // Two Strings are called the anagram if they contain the same characters.
        // However, the order or sequence of the characters can be different

        if(a.length()!=b.length())
            return false;
        //convert the string into lower case
       a= a.toLowerCase();
      b= b.toLowerCase();
      //then sort the String
    a=   sortString(a.toCharArray());
      b=  sortString(b.toCharArray());
        System.out.println("after sorting  a is:;"+a+":b is::"+b);

      for(int i=0;i<a.length();i++)
      {
          if(a.charAt(i)!=b.charAt(i))
              return false;
          else
              return true;
      }
        return false;

    }

    public static String sortString(char arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
       return  new String(arr);
    }

    public static void usingJava8(String str1,String str2)
    {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //Checking for the length of strings
        if (str1.length() != str2.length()) {
            System.out.println("Both the strings are not anagram");
        }
        else {
            //Converting both the arrays to character array
            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();

            //Sorting the arrays using in-built function sort ()
            Arrays.sort(string1);
            Arrays.sort(string2);

            //Comparing both the arrays using in-built function equals ()
            if(Arrays.equals(string1, string2) == true) {
                System.out.println("Both the strings are anagram");
            }
            else {
                System.out.println("Both the strings are not anagram");
            }
        }
    }

    static boolean arekAnagrams(String str1, String str2,
                                int k)
    {
        // If both strings are not of equal
        // length then return false
       // String str1 = "anagram";
        //String str2 = "grammar";
//Time complexity: O(n)
//Auxiliary Space: O(1)
         final int MAX_CHAR = 26;

        int n = str1.length();
        if (str2.length() != n)
            return false;

        int[] count1 = new int[MAX_CHAR];
        int[] count2 = new int[MAX_CHAR];
        int count = 0;

        // Store the occurrence of all characters
        // in a hash_array
        for (int i = 0; i < n; i++)
            count1[str1.charAt(i) - 'a']++;
        for (int i = 0; i < n; i++)
            count2[str2.charAt(i) - 'a']++;

        // Count number of characters that are
        // different in both strings
        for (int i = 0; i < MAX_CHAR; i++)
            if (count1[i] > count2[i])
                count = count + Math.abs(count1[i] -
                        count2[i]);

        // Return true if count is less than or
        // equal to k
        return (count <= k);
    }


}

