package org.example.javabasic;

public class floatingdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//boolean b=0;//Type mismatch: cannot convert from int to boolean
		
	//	boolean n=True;//True cannot be resolved to a variable
		//boolean m="true";//Type mismatch: cannot convert from String to boolean
		
		/*int x=0;
		if(x)
		{
			System.out.print("ok");
		}else
		{
			System.out.print("not ok");	
		}
		
		while(x)
			
			{
				System.out.print("ok");
			}else
			{
				System.out.print("not ok");	
			}*/
			
			// char h =null;
			 
			 int x1=10;
			// int v=0786;//The literal 0786 of type int is out of 
			// int  B=0Xface;//valid
			 int  B1=0XBEEF;//valid
			//int  B2=0XBEER;//invalid
			 int n=0777;
			//int l=086;
			 
			 int y=010;
			 int z=0x10;
			 
			 long l1=10l;
			 byte b=(byte)3000;
			 
			 float s=234556.9999999F;
			 float s1=234556.9999999f;
			 double r=7889.54321D;
			 double r1=7889.54321d;
			//double r2=0x2345.90875;//	- Invalid hex literal number

			 double r3=02345.90875;//it is decimal literal
		//	double r4=0786;//invalid
			 double r5=0xFace;
			 double d1=0777;
			 
			 double d2=10;
			// int c4=10.0;
			 System.out.println(r5);//64205.0
			 double d9=1.2e3;//1.2*10 pow3
			// 1.2*1000=1200.0
			 
			 System.out.println(d9);//64205.0
			// char ch='ab';//invalid character constant
		//	 char ch1=v;//v cannot be resolved to a variable
			 char cv=97;
			 System.out.println(cv);
			 char ch4=0xface;
			 char ch6=0777;
			 char ch7=65535;
			 
			// char ch8=65536;//Type mismatch: cannot convert from int to char
			 System.out.println(ch7);
			 char ch8='\u0061';
			 char ch0='\t';
			// char ch1='\m';\\Invalid escape sequence (valid ones are \b \t \n \f \r \" \' \\ )
			 System.out.println(ch8);
			 int hh=0b111;
			 double dd8=1_11_11__78_90;
			 double d6=1__23__6.7_7;
			// double d7=_1_23_456._7_9;//_1_23_456 cannot be resolved to a variable
			// double d0=1_23_456_._7_9;
			// double d0=1_23_456._7_9_;
			 
	}

}
