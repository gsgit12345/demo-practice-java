package org.example.algorithmn;

public class MyStringToNumber {
	public static int convert_String_To_Number(String numStr) {
		char ch[] = numStr.toCharArray();
		boolean isNegative=false;
		int sum = 0;
		int i=0;
		int len=ch.length;
		//get ascii value for zero
		int zeroAscii = (int)'0';
		if( numStr.charAt(0) == '-' ){
            isNegative = true;
            i = 1;
        }
		 while( i < len ){
			int tmpAscii = (int)numStr.charAt(i++);
			System.out.println("tmpAscii=="+tmpAscii);
			sum = (sum*10)+(tmpAscii-zeroAscii);
			System.out.println("sum=="+sum);
			
		}
		return sum;
	}
	public static void main(String a[]) {
		//System.out.println("\"3256\" == "+convert_String_To_Number("3256"));
	System.out.println("\"76289\" == "+convert_String_To_Number("76289"));
		//System.out.println("\"90087\" == "+convert_String_To_Number("90087"));
	}
}