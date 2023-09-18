package org.example.StringQuestion;

public class LargestWordInDictionaryByDeletingSomeChar {

    public static void main(String str[])
    {
        String dict[] = {"ale", "apple", "monkey", "plea"};
     String   input = "abpcplea";
     //output:--apple

        String dict2[] = {"pintu", "geeksfor", "geeksgeeks",
                " forgeek"};
        String input2="geeksforgeeks";
        //output:-geeksgeeks
     String   dict3[] = {"prog", "ram", "program"};
        String input3 = "apbreoigroakml" ;
//
        String result=  findLongestStringDEleteingCharInDict(dict3,input3);
System.out.println("result is::"+result);

    }
 public  static String    findLongestStringDEleteingCharInDict(String [] str,String input)
 {
     String result="";
     int length=0;
     for(String word:str)
     {
//System.out.println(isSubsequence(word,input));
         if(length<word.length() && isSubsequence(word,input))
         {
             result =word;
             length=word.length();
             //System.out.println("word is:"+word);
         }
     }
     return  result;
 }
    public static  boolean isSubsequence(String word,String  str)
    {
        int j=0;
        int m=word.length();
        for(int i=0;i<str.length()&&j<word.length();i++)
        {
            if(word.charAt(j)==str.charAt(i))
            {
                j++;
            }

        }
        return (j==m);
    }
}
