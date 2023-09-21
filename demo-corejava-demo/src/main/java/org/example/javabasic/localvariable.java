package org.example.javabasic;

public class localvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		for(int j=0;j<3;j++)
		{
			i=i+j;
		}
		//System.out.println(i+":"+j);//j cannot be resolved to a variable
		
		//===========first scenario=====
		try
		{
			int y=Integer.parseInt("ten");
		}catch(Exception ex)
		{
		//	y=10;//j cannot be resolved to a variable
		}
		//System.out.println(y);//y cannot be resolved to a variable
	//	===========second scenario=====
		int r;
		if(args.length>0)
		{
			r=10;
		}
		//System.out.println(r);//The local variable r may not have been initialized
		
		//===========third scenario=====
		int r1;
		if(args.length>0)
		{
			r1=10;
		}else
		{
			r1=9;
		}
		System.out.println(r1);
		
	}

}
