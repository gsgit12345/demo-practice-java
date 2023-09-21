package sortmapbykeyandvalue;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.stream.Collectors;

public class DisplayObjectNotSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Properties  prop=System.getProperties();
		
		Set<Map.Entry<Object, Object>>  cntMap=prop.entrySet();
		
		//LinkedHashMap<String, String> stream=
				
	LinkedHashMap<String, String>	sort=cntMap.stream().collect(Collectors.toMap(k-> (String)k.getKey(), e-> (String) e.getValue()))
		.entrySet().stream().sorted(Map.Entry.comparingByKey()).
		collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue ,(old,oldnew)->old,LinkedHashMap::new));
	
	sort.forEach((k,v)->System.out.println("key:"+k+":value:"+v));
	//System.out.println(sort);
		

	}

}
