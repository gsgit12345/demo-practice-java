package org.example.algorithmn;

import java.util.ArrayList;

public class Substringinastring {
public static void main(String str[])
{
	
}
public String repeatingSubstring(String as)
{
	ArrayList<String> aL=new ArrayList<String>();
	String repeated = "";
	int count=0;
	for (String string : aL) {
		if(string.equals(repeated)){
			count++;
		}else if(count==0){
			repeated = string;
			count++;
		}else{
			count--;
		}
	}
	System.out.println(repeated);
	return repeated;
}
}
