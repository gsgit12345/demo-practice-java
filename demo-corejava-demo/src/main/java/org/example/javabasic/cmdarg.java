package org.example.javabasic;

public class cmdarg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
for(int i=0;i<=args.length;i++)
{
	System.out.println(args[i]);
}
//java cmdarg a b c
//output abc arrayindexoutofexception

//java cmdarg a b  

//output ab  arrayindexoutofexception
//java cmdarg 
//output  arrayindexoutofexception
//if replace <= with < then there is not exception
	}

}
