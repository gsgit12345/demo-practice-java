package org.example.javabasic;

public class Datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//short a=true;//can not convert to short into boolean
		//short b=10.6;//can not convert to double into short
	//	short d="abc";//can not convert to string into short
		short c='a';//it is ok
		System.out.println(c);
//byte --8 bit
//short-2 byte
//int ---4 byte
//long --8-byte--2pow63 to 2 pow 63-1
		
		//int x=2147483648;//The literal 2147483648 of type int is out of range
		int x=2147483647;
		//int x1=2147483648l;//Type mismatch: cannot convert from long to int
		//int j=true;//Type mismatch: cannot convert from boolean to int
		
	}

}
