package org.example.micell;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class CorecollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//treeset
		
		TreeSet<String> tree=new TreeSet<>();//it is backed by treemap
		
	//	tree.add(null);//Exception in thread "main" java.lang.NullPointerException
		TreeMap<String, String> tr=new TreeMap<>();
		//tr.put(null, null);//Exception in thread "main" java.lang.NullPointerException
		tr.put(" ", null);
		tr.put("kk", null);
	//	System.out.println(tr);//it takes multile null value
		
		HashSet<String> hash=new HashSet<>();
		hash.add(null);
		hash.add(null);
	//	System.out.println(hash);//it takes the multiple null value.
		
		LinkedHashMap<String, String> link=new LinkedHashMap<>();
		link.put(null, null);
		link.put(null, null);
		//System.out.println(link);//one null key and value
		LinkedHashSet se=new  LinkedHashSet<>();
		se.add(null);
		System.out.println(se);
		
		Hashtable te=new Hashtable<>();
		te.put(null, null);
		te.put(null, null);
		System.out.println(te);
		
ArrayList<String> str1=new ArrayList<>();
str1.add("1");
System.out.println(str1.size());//default capacity is 0;
System.out.println(str1.get(0));
		
	}

}
