package org.example.micell;

import java.io.FileNotFoundException;

class ExceptionExample3 {
	 public static void main(String[] args) {
	  test();
	 }
	 private static void test(){
	  try{
	   System.out.println("In try");
	   throw new ArithmeticException();
	  } catch(Exception e){
	   System.out.println("In catch");
	  // throw new ArrayIndexOutOfBoundsException();
	   throw new FileNotFoundException();
	  } finally{
	   System.out.println("In finally");
	   throw new NullPointerException();
	  }
	 }
	}
