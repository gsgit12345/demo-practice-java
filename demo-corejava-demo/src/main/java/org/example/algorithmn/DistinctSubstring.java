package org.example.algorithmn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DistinctSubstring {

    public static int distinctSubstring(String str) {
        //Time Complexity: O(n3logn)
      //  Auxiliary Space: O(n),  since n extra space has been taken.

        // Put all distinct substring in a HashSet 
        Set<String> result = new HashSet<String>();
//here substr() works in linear time
        // List All Substrings 
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                // Add each substring in Set 
                result.add(str.substring(i, j));

            }
        }

        System.out.println("result" + result.toString());
        // Return size of the HashSet 
        return result.size();
    }
public static int countAllSubstring(String str)
{
    //Time Complexity: O(n2)
    //Auxiliary Space: O(n)
    Set<String> hashset=new HashSet<>();
    for(int i=0;i<str.length();i++)
    {
        String ch="";
        for(int j=i;j<str.length();j++)
        {
        ch=ch+str.charAt(j);

            hashset.add(ch);
        }
    }
    return  hashset.size();
}
    // Driver Code 
    public static void main(String[] args) {
        String str = "aaaa";
        //a
        //aa
        //aaa
        //aaaa
        String str1 = "aaabc";
//ans:-bc b abc ab aabc aa aaa c a aaab aab aaabc

        System.out.println(countAllSubstring(str1));
    }
} 