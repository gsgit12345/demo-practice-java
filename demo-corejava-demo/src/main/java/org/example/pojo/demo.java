package pojo;

import java.util.Hashtable;

public class demo {

	public static void main(String[] args) {
		String ss="hello";
		
		String kk="hello";
		
		/*if(ss.equalsIgnoreCase(kk))
		{
			System.out.println("hello");
		}
		else
		{
			System.out.println("not hello hello");	
		}
*/
		
		pojo pp=new pojo("hari", "mohan");
		pojo p=new pojo("hari", "mohan");
		pp=p;
		if(pp==p)
		{
			System.out.println("hello");
		}
		else
		{
			System.out.println("not hello hello");	
		}
		
		Hashtable  tt=new Hashtable<>();
		
		tt.put("dff", "hello");	
		tt.put(null, "hello");
		System.out.println("value is::"+tt);	
		
	}

}
