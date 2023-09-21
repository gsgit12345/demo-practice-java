package org.example.algorithmn;

import java.util.ArrayList;

public class ReversereverseVowelsOnly {
public static void main(String str[])
{
	String st="helou aaeeu";
	System.out.println("hello:;"+reverseVowels(st));
}

public static String reverseVowels(String s) {
    ArrayList<Character> vowList = new ArrayList<Character>();
    vowList.add('a');
    vowList.add('e');
    vowList.add('i');
    vowList.add('o');
    vowList.add('u');
    vowList.add('A');
    vowList.add('E');
    vowList.add('I');
    vowList.add('O');
    vowList.add('U');
 
    char[] arr = s.toCharArray();
 
    int i=0; 
    int j=s.length()-1;
 
    while(i<j){
        if(!vowList.contains(arr[i])){
            i++;
            continue;
        }
 
        if(!vowList.contains(arr[j])){
            j--;
            continue;
        }
 
        char t = arr[i];
        arr[i]=arr[j];
        arr[j]=t;
 
        i++;
        j--; 
    }
 
    return new String(arr);
}

static String reverseVowels2(String s) {
    int i = 0;
    int j = s.length() - 1;
    while (i < j) {
        while (i < j && !isVowel(s.charAt(i))) {
            i ++;
        }
        while (i < j && !isVowel(s.charAt(i))) {
            j --;
        }
        swap(s.charAt(i++), s.charAt(j--));
    }
    return s;
}

public static boolean  isVowel(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
           c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
}
public static void swap(char i,char j)
{

}
}