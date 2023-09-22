package org.example.customecollectionclass;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

//it does not store duplicate element
public class CustomeArrayList extends  ArrayList{

	public boolean add(Object o)
	{
		if(this.contains(o))
		{
			return true;
		}else
		{
			return super.add(o);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomeArrayList arr=new CustomeArrayList();
		
		arr.add(1);
		arr.add(1);
		arr.add(1);
		arr.add(10);

		System.out.println(arr);
		
		//ConcurrentHashMap<String, String> mm=new ConcurrentHashMap<>();
		//mm.put(null, null);
		
		CopyOnWriteArrayList<String> mm=new CopyOnWriteArrayList<>();
		mm.add(null);
		mm.add(null);
		
		CopyOnWriteArraySet<String> set=new CopyOnWriteArraySet<>();
		set.add(null);
		set.add(null);
		
	//	System.out.println(mm);
		//System.out.println(set);
		
		Hashtable<String,String>  mmm=new Hashtable<>();
		mmm.put(null, null);
		System.out.println(mmm);
	}

}
