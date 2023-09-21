package innerclass;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.TreeMap;
import java.util.TreeSet;

public class hashTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String, String> tt=new Hashtable<>();
		tt.put("ll", null);
		System.out.println(tt);
		HashSet set=new HashSet();
		
set.add("hello");
set.add(null);
set.add("kk");
set.add("kk2");
System.out.println(set);

TreeSet ss=new TreeSet();

ss.add("kk3");
ss.add("kklo");
//ss.add(null);
System.out.println(ss);
TreeMap<String, Integer> trr=new TreeMap<>();
//trr.put(null, 1);

//System.out.println("kkk"+trr);
	}

}
