package org.example.algorithmn;

import java.util.HashMap;

public class Anagramofstring {

	public static void main(String[] args) {
		
		
		String st="listen";
		
		
		String st2="tensli";
		
		//System.out.println("string is anagram:=="+findanagram(st,st2));
				

	}
public static  boolean getAnagram(String st,String st2)
{
	
	st=st.toLowerCase();
	st2=st.toLowerCase();
	
	if(st==null||st2==null)
	{
		return true;
	}
	if(st.isEmpty()||st2.isEmpty())
	{
		return true;
	}
	
	if(st.length()!=st2.length())
	{
		return false;
	}
	HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	for(int i=0;i<st.length();i++)
	{
		char ch=st.charAt(i);
		
		Integer value=map.get(ch);
		
		if(value==null)
		{
			value=1;
		}
		else
		{
			value+=1;
		}
		map.put(ch, value);
	}
	
	for(int j=0;j<st2.length();j++)
	{
		char ch2=st2.charAt(j);
		
		Integer value2=map.get(ch2);
		
		if(value2==null)
		{
			return false;
		}
		if(value2==1)
		{
			map.remove(ch2);
		}
		else
		{
			map.put(ch2,value2-1);
		}
	}

	return map.isEmpty();
}

	public static boolean isAnagram(String word, String anagram) {
		if (word.length() != anagram.length()) {
			return false;
		}
		char[] chars = word.toCharArray();
		for (char c : chars) {
			int index = anagram.indexOf(c);
			if (index != -1) {
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			} else {
				return false;
			}
		}
		return anagram.isEmpty();
	}

	public static boolean checkAnagram(String first, String second) {
		char[] characters = first.toCharArray();
		StringBuilder sbSecond = new StringBuilder(second);
		for (char ch : characters) {
			int index = sbSecond.indexOf("" + ch);
			if (index != -1) {
				sbSecond.deleteCharAt(index);
			} else {
				return false;
			}
		}
		return sbSecond.length() == 0 ? true : false;
	}

}
