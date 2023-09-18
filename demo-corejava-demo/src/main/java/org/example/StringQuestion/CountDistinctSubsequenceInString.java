package org.example.StringQuestion;

import java.util.Arrays;
import java.util.HashMap;

public class CountDistinctSubsequenceInString {
    public static void main(String str[])
    {
String str1="abcd";
String sd="ggg";
        countDistinctSubsequence(str1);
    }
    public static  int countDistinctSubsequence(String str)
    {
        //https://www.youtube.com/watch?v=9UEHPiK53BA
        //Time Complexity: O(n)
        //Space Complexity: O(1)
        //1-create array with str.length+1 and create a hashmap of character and integer
        //2- we loop from i=1 till str.length and store in the array like count[i]=2 * count[i-1].multiply the count index
        int subsequence[]=new int[str.length()+1];
        subsequence[0]=1;
        HashMap<Character,Integer> indexofChar=new HashMap<>();
        for(int i=1;i<subsequence.length;i++)
        {

            subsequence[i]=2 * subsequence[i-1];
            char ch=str.charAt(i-1);
            if(indexofChar.containsKey(ch))
            {
               int index=indexofChar.get(ch);
                subsequence[i]=subsequence[i]-subsequence[index-1];

            }
            indexofChar.put(ch,i);
        }
        System.out.println(subsequence[str.length()]-1);
        System.out.println(Arrays.toString(subsequence)+":map is::"+indexofChar.toString());
        return 0;
    }
}
