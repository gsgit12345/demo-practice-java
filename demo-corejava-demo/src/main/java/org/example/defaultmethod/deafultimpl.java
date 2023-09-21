package org.example.defaultmethod;

import java.util.HashMap;
import java.util.Map;

 class deafultimpl  implements interface1,interface2 {

	
	public static void main(String[] as) {
		// TODO Auto-generated method stub
		deafultimpl dd=new deafultimpl();
		
		dd.hello();
		
		
		
		
		Map<Employee,String> emp=new HashMap<>() ;
		
		Employee em=new Employee("1","harish","f-3");
		Employee em0=new Employee("1","harish","f-3");
		Employee em1=new Employee("5","harish3","f-8");
		System.out.println(em.hashCode());
		Employee em2=new Employee("0","harish4","f-0");
		Employee em3=new Employee("2","harish7","f-q");
		emp.put(em, "xyz");
		emp.put(em1, "xyz3");
		emp.put(em2, "xyzf");
		emp.put(em3, "xyzq");
		emp.put(em0, "xyzq");
		
		
	System.out.println(	emp.get(em).toString());
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
	//	interface2.super.hello();
	}

	

	

}
