package practice;

import java.util.HashSet;

public class distinctsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="aaa";
System.out.println(distinctSubstring(str));
	}
public static int distinctSubstring(String str)
{
	
	int i=0;
	int j=0;
	HashSet<String> set=new  HashSet<>();
	for(i=0;i<=str.length();i++)
	{
		for(j=i+1;j<=str.length();j++)
		{
			set.add(str.substring(i,j));
		}
	}
	
	return set.size();
}
}
