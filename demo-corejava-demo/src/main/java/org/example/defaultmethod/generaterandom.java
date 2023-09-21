package org.example.defaultmethod;

import java.util.Random;

public class generaterandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rr=new Random();
		for(int i=0;i<3;i++)
		{
			System.out.println(rr.ints(1,5,11).findFirst().getAsInt());
		}
	}

}
