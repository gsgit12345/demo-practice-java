package org.example.javabasic;

public class testtvarg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
m1();
m1(1,8);
m1(1);
m2(new int[] {10});
m2(new int[] {});
m2(new int[] {7,9});
	}
public static void m1(int...is)
{
	System.out.println("variable length method");
}
public static void m1(int is)
{
	System.out.println("normal length method"+is);	
}
/*output
 * variable length method
variable length method
normal length method1*/
public static void m2(int[] is)
{
	System.out.println("array length method"+is);	
}
public static void m3(int[]... is)
{
	System.out.println("array length method"+is);	
}
public static void m3(int[][]... is)
{
	System.out.println("array length method"+is);	
}
}
