package org.example.micell;

import java.util.HashMap;

import pojo.Students;

public class HashmDemo {

	public static void main(String[] args) {
		Students S1 = new Students("taj",21);
        Students S2 = new Students("taj",21);

        System.out.println(S1.hashCode());
        System.out.println(S2.hashCode());

        HashMap<Students,String > HM = new HashMap<Students,String > (); 
        HM.put(S1, "tajinder1");
        HM.put(S2, "tajinder");
        System.out.println(HM.size());

	}

}
