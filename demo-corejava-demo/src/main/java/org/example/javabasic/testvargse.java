package org.example.javabasic;

public class testvargse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {3,4,5,6};
		int[] a1= {13,54,5,96};
		m1(a,a1);
	}
	public static void m1(int[]... kl)
	{
		for(int[] v:kl)
		{
			System.out.println(v[0]);
		}
	}

}
