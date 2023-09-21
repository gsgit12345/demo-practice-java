package practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class getNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aammjjuklsssyy";
		System.out.println(getNonRepeatedChar(str));

	}

	public static Character getNonRepeatedChar(String str)
	{
		if(str==null||str.isEmpty())
			return null;
		
	char ch[]=	str.toCharArray();
	Map<Character,Integer> objMap=new LinkedHashMap<>();
	for(char c:ch)
	{
		if(objMap.containsKey(c))
		{
			objMap.put(c, objMap.get(c)+1);
		}
		else
		{
			objMap.put(c, 1);	
		}
		//objMap.put(c, objMap.containsKey(c)?objMap.get(c)+1:1);
	}
	System.out.println(objMap);
	for(Entry<Character,Integer> ent:objMap.entrySet())
	{
		if(ent.getValue()==1)
			return ent.getKey();
	}
		return null;
	}
}
