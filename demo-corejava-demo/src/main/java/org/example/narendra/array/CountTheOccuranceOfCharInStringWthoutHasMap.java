package org.example.narendra.array;

public class CountTheOccuranceOfCharInStringWthoutHasMap {
    public static void main(String str[])
    {
        countCharWithoutHashMap("GeeeEEKKKss");
    }
    public static void countCharWithoutHashMap(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            int count=1;

            while(i+1<str.length()&&str.charAt(i)==str.charAt(i+1))
            {
                i++;
                count++;

            }
            System.out.print(":"+str.charAt(i)+"-> :"+count );

        }
        System.out.println();

    }
}
