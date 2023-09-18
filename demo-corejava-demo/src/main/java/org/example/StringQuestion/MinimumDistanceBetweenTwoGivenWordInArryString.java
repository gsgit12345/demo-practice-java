package org.example.StringQuestion;

public class MinimumDistanceBetweenTwoGivenWordInArryString {

    public static void main(String str[])
    {
        String st[] = {"geeks","for","geeks","contribute","practice"};
        //   word1 = “geeks”, word2 = “practice”
        String word="geeks";
        String word1="practice";

      int distanc=  minimumDistanceBetweenTwoWord(st,word,word1);
      System.out.println("distance is::"+distanc);
    }
    public static int minimumDistanceBetweenTwoWord(String array[],String word1,String word2)
    {


        int index=-1;
        int index1=-1;
        int minDistance=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++)
        {
            if(array[i].equalsIgnoreCase(word1))
            {
                index=i;
            }
            if(array[i].equalsIgnoreCase(word2))
            {
                index1=i;
            }
            if(index!=-1&&index1!=-1)
            {
                minDistance=Math.min(minDistance,Math.abs(index-index1));
            }
        }
        return minDistance;
    }
}
