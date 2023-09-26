package org.example.stringandarrayquestion;

import java.util.HashMap;
import java.util.Map;

public class FindLongestSubstringlengthWithKuniqueCharacter {
    public static void main(String str[])
    {
     //   Find the longest substring with k unique characters in a given string
      //  Input: Str = “aabbcc”, k = 1
        //Output: 2
        //Explanation: Max substring can be any one from {“aa” , “bb” , “cc”}.

        //Input: Str = “aabbcc”, k = 2
        //Output: 4
        //Explanation: Max substring can be any one from {“aabb” , “bbcc”}.
        //Input: Str = “aabbcc”, k = 3
        //Output: 6
        //Explanation:
        //There are substrings with exactly 3 unique characters
        //{“aabbcc” , “abbcc” , “aabbc” , “abbc” }
        //Max is “aabbcc” with length 6.
String st="aabbcc";
int kUniqueChar=1;
//output:-2
        String st1="aabbcc";
        int kUniqueChar1=2;


        findLongestSubstringWithKdistinctCharacterWithSlidingWindowApproach(st1,kUniqueChar1);


    }

    public static void findLongestSubstringWithKdistinctCharacterWithSlidingWindowApproach(String str,int kuniquechar)
    {
        //https://www.youtube.com/watch?v=FsIyn_oe3eo
        int max=-1;
        Map<Character,Integer> frequencyMap=new HashMap<>();
        int j=0;
        int i=0;
        while(j<str.length())
        {
            //adding character in the map along with frequency
            frequencyMap.put(str.charAt(j),frequencyMap.getOrDefault(str.charAt(j),0)+1);
            //reduce the frequency from map if frequencyMap.size>kuniquechar.here we are updating the sliding
            // window using the i variable
            if(frequencyMap.size()>kuniquechar)
            {
                frequencyMap.put(str.charAt(i),frequencyMap.getOrDefault(str.charAt(i),0)-1);
                //we are updation the window
                if(frequencyMap.get(str.charAt(i))==0)
                {
                    frequencyMap.remove(str.charAt(i));
                    //here removing the those character whose frequency become zero
                }
                i++;
            }
            if(frequencyMap.size()==kuniquechar)
            {


                int len=j-i+1;
                max=max<len?len:max;
            }
            j++;
        }
        System.out.println("frequency map::"+frequencyMap.toString());
        System.out.println("max length is::"+max);
    }
}
