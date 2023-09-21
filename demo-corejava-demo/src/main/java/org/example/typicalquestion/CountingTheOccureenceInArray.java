package executerdemo.typicalquest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountingTheOccureenceInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char cc[]= {'a','a','b','h','h','k','r','r','y','a'};
//findNumOccurenceinArr(cc);

String st="javaee";
getNonRepeatedChar(st);
	}

	public static void findNumOccurenceinArr(char array[])
	{
		if(array==null||array.length==0)
			return;
		Map<Character,Integer> countMap=new HashMap<>();
		
		for(int i=0;i<array.length;i++)
		{
			//System.out.println(array[i]);
			Character c=array[i];
			if(countMap.containsKey(c))
			{
				
				countMap.put(c, countMap.get(c)+1);
			}
			else
				countMap.put(c, 1);
		}
		System.out.println(countMap);
		for(char c:countMap.keySet())
		{
			System.out.println(c+"::"+countMap.get(c));
		}
	}
	

	public static void firstNonRepeatingChar(char array[])
	{
		if(array==null||array.length==0)
			return;
		Map<Character,Integer> countMap=new HashMap<>();
		
		for(int i=0;i<array.length;i++)
		{
			//System.out.println(array[i]);
			Character c=array[i];
			if(countMap.containsKey(c))
			{
				
				countMap.put(c, countMap.get(c)+1);
			}
			else
				countMap.put(c, 1);
		}
	//	System.out.println(countMap);
			}
	

	public static Character getNonRepeatedChar(String str)
	{
		if(str==null||str.isEmpty())
			return null;
		Character cc='\0';
	char ch[]=	str.toCharArray();
	Map<Character,Integer> objMap=new LinkedHashMap<>();
	for(char c:ch)
	{
		objMap.put(c, objMap.containsKey(c)?objMap.get(c)+1:1);
	}
	//System.out.println(objMap);
	for(Entry<Character,Integer> ent:objMap.entrySet())
	{
		if(ent.getValue()==1)
			cc= ent.getKey();
	}
	System.out.println(cc);
		return cc;
	}
}
