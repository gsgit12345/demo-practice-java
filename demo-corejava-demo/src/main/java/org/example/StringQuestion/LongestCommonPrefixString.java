package org.example.StringQuestion;

public class LongestCommonPrefixString {
    public static void main(String str[])
    {
        String st[]={"club","clan","clutty","clouse"};

       String prefix= findLongestCommonPrefixInString(st);
       System.out.println("prefix is::"+prefix);

    }
    public static String findLongestCommonPrefixInString(String st[])
    {
        String pre=st[0];

        for(int i=1;i<st.length;i++)
        {
            while(st[i].indexOf(pre)!=0)
            {
                pre=pre.substring(0,pre.length()-1);
            }
            if(pre.isEmpty())
                return "-1";
        }
        return pre;
    }
}
