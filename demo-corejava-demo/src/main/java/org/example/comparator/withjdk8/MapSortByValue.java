package comparator.withjdk8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapSortByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final Map<String, Integer> wordCounts = new HashMap<>();

        wordCounts.put("USA", 100);
        wordCounts.put("jobs", 200);
        wordCounts.put("software", 50);
        wordCounts.put("technology", 70);
        wordCounts.put("opportunity", 200);
        final Map<String, Integer> sortedByCount = sortByValue(wordCounts);

        List<Developer> devlist=new ArrayList<Developer>();
        devlist.add(new Developer(10, "harish", 200));
        devlist.add(new Developer(22, "rakesh", 300));
        devlist.add(new Developer(24, "praksah", 1300));
        devlist.add(new Developer(34, "suresh", 1800));
        devlist.add(new Developer(30, "sureshki", 1200));
        
        
        System.out.println(getName(devlist));
//System.out.println(sortedByCount);


	}

	public static Map<String,Integer> sortByValue(final Map<String, Integer> wordCounts)
	{
		
		
		Map<String, Integer>  hasMap=wordCounts.entrySet().stream().
				sorted(Map.Entry.<String,Integer>comparingByValue()).
				collect(Collectors.
		toMap(Entry::getKey,Entry::getValue, (oldVl,newVal)->oldVl,LinkedHashMap::new));
		//{software=50, technology=70, USA=100, jobs=200, opportunity=200}
		System.out.println("newsorttt::"+hasMap);
		Map<String, Integer>  hasMap2=	wordCounts.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue()).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
		System.out.println("newsort::"+hasMap2);
		return hasMap2;
	}
	public static Map<String,Integer> sortByKey(final Map<String, Integer> wordCounts)
	{
		Map<String, Integer>  hasMap=	wordCounts.entrySet().stream().sorted
				(Map.Entry.<String,Integer>comparingByKey()).
				collect(Collectors.toMap(Entry::getKey,Entry::getValue, (e,e1)->e,LinkedHashMap::new));		
		return hasMap;
	}
	
	public static Map<String,Integer> sortByKey2WAY(final Map<String, Integer> wordCounts)
	{
		Map<String,Integer>	map=new LinkedHashMap<>();	
		wordCounts.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByKey().reversed()).
		forEachOrdered(x-> map.put(x.getKey(),x.getValue()));
		return map;
	}
	
	public static Map<String,Integer> sortByKeyReverse(final Map<String, Integer> wordCounts)
	{
		Map<String,Integer>	map=new LinkedHashMap<>();
		
		map=wordCounts.entrySet().stream().sorted(Map.Entry.
				comparingByValue(Comparator.reverseOrder())).
				collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (old,newv)->old,LinkedHashMap::new));	
		return map;
	}
	
	public static List<Developer> sortByField(List<Developer> list)
	{
		List<Developer> sortedList = list
        .stream() // get stream for unique SET
                .sorted(Comparator.comparing(Developer::getName).thenComparing(Developer::getAge)) // rank comparing
                .collect(Collectors.toList()); // elements are stored to new list
		
		
		
		return sortedList;
	}
	
	public static List<String> getName(List<Developer> list)
	{
		
		
	List<String> name=	list.stream().filter(s->s.getSalary()>50).map(Developer::getName).collect(Collectors.toList());
	
	HashMap<String, String> map=new HashMap<>();
	
	List<Integer> str=list.stream().filter(s->s.getAge()>50).map(Developer::getAge).collect(Collectors.toList());
	
	
		
	String joi=String.join(",", name);
	
	System.out.println(joi);
		return name;
	}
}
