package org.example.javabasic;

public class incredecrementop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=++x;//11
		
		//y=++10;compile time error
		//int t=10;
	//	int r=++(++t); compile time error required variable found value
	final	int x1=10;
		//x1=11;//The final local variable x1 cannot be assigned. 
		//It must be blank and not using a compound assignment
	
	//final int x2=10;
	//x2++;The final local variable x2 cannot be assigned. 
	//It must be blank and not using a compound assignment
	int x2=10;
	x2++;
	System.out.println(x2);
	
	char x3=65;
	x3++;
	System.out.println(x3);
	double x4=10.5;
	x4++;
	System.out.println(x4);
	
	boolean x5=true;
//	x5++;//compile time error
	System.out.println(x5);
	
	byte b=10;
	//b=b+1;//compile time error
	System.out.println(b);
	
	byte b1=10;
b1++;//in this case internal typecasting is performed.
	System.out.println(b1);
	
	byte c=10;
			
			byte c1=20;
	//byte c2=c+c1;//comile time error max(int,type of c,type of c1)
			byte c2=(byte)(c+c1);
			
			
			
	}

}
