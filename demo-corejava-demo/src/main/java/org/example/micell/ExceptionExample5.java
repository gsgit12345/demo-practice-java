package org.example.micell;

class ExceptionExample5{ 
	 
	 public static final void main(String[] args) {
	  System.out.println(test());
	 }
	 
	 private static int test() {
	  try {
	   String str = null;
	   //return str.toString();
	   return 0/10;
	   
	  }finally {
	  // return "hello finally";
		  return 0;
	  }
	 } 
	}
