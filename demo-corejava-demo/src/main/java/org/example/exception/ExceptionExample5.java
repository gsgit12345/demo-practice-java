package org.example.exception;

class ExceptionExample5 {
	private static void test() {
		try {
		} catch (NullPointerException e) {
		}
	}
	public static void main(String str[])
	{

	}
}

/*
Above code is perfectly valid and compiler doesn't complains because when you catch Unchecked exception that is either RuntimeException or 
Error or any subclass of it then compiler doesn't check what is written in try block because this Exception/Error can occur at run time, 
so for compilation it is perfectly valid call. */

