package org.example.arrays.onedimensional.arrayQuestion;

import java.util.HashMap;

public class FindTheMaxOccuranceOfCharInString {
    public static void main(String str[])
    {
        //https://www.youtube.com/watch?v=ea8L1x_JSvM&list=PL-Jc9J83PIiHq5rMZasunIR19QG3E-PAA&index=3
        String st="abhjahhaasssussuuuuuu";
        int higest =getHighestFrequencyCharacter(st);
        System.out.println("highestfrequency:"+higest );
    }

    public static  int getHighestFrequencyCharacter(String str)
    {
        HashMap<Character,Integer> frequency=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char st=str.charAt(i);
            if(frequency.containsKey(st))
            {
              int fre=  frequency.get(st);
                frequency.put(st,fre+1);
            }else
            {
                frequency.put(st,1);
            }
        }
        int ans=0;
        char freq= str.charAt(0);
        for(Character key:frequency.keySet())
        {
            if(frequency.get(key)>frequency.get(freq))
            {
                ans=frequency.get(key);
            }
        }

        return ans;
    }
}
