package StringInterviewQ;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String hh="hellooojkhrrr";
Map<Character,Integer>getkt= getDuplicate(hh);

System.out.println(getkt);

Map<Character,Integer> hashm=getDuplicateUsing8(hh);
System.out.println(hashm);

	}

	
	public static  Map<Character,Integer> getDuplicate(String str)
	{
		
		if(str==null||str.isEmpty())
			return null;
		
		char ch[]=str.toCharArray();
		Map <Character,Integer>objHash=new HashMap<Character,Integer>();
		for(char c:ch)
		{
			
		if(objHash.containsKey(c))
		{
			int v=objHash.get(c);
			objHash.put(c, ++v);
		}else
		{
			objHash.put(c, 1);
		}
		}
			
		return objHash;
	}
	
	public static  Map<Character,Integer> getDuplicateUsing8(String str)
	{
		
		if(str==null||str.isEmpty())
			return null;
		Map <Character,Integer>objHash=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			objHash.compute(c, (key,value)->(value==null) ? 1 : value+1);
			
		}
		return objHash;
		
	}
	
}
