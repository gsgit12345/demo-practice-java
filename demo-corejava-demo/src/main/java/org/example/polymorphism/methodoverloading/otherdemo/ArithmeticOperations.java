package practice.overload;

class ArithmeticOperations{
	public void add()
	{
		
	}
public void add(int num1,int num2){
     System.out.println(num1 + num2);
     }

public int add(int num1,int num2, int num3){
     int result = num1 + num2 + num3;
     return result;
}
     
public static void main(String args[]){
     ArithmeticOperations obj = new ArithmeticOperations();     
     obj.add(1,2);
     int result = obj.add(1,2,3);
     System.out.println(result);
}
}

/*
If a class have multiple methods with same name but with different parameters list, 
it is known as Method Overloading. Parameters lists should differ in either,

Number of parameters.
Data type of parameters.
Sequence of data type of parameters. */

/*
Method overloading is one of the way through which java supports polymorphism.
Polymorphishm achieved using method overloading is known as Compile time/Static polymorphism because 
which method will be invoked is decided at compile time. */
