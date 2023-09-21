package org.example.javabasic;

class student
{
	String name;
	int rollno;
}
public class instancevariable {
int k;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.prinln(k);//Cannot make a static reference to the non-static field k
		
		instancevariable j=new instancevariable();
		
		System.out.println(j.k);
	}
public void hhh()
{
	System.out.println(k);//we can access instance variable fron instance area.
}
}
