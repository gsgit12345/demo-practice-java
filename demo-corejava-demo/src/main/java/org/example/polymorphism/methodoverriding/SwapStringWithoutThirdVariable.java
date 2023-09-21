package Stringquestion;

public class SwapStringWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapValuWithoutThirdVariable();
	}

	
	public static void swapValuWithoutThirdVariable()
	{
        // Declare two strings
        String a = "Hello";
        String b = "World";
          
        // Print String before swapping
        System.out.println("Strings before swap: a = " + 
                                       a + " and b = "+b);
          
        // append 2nd string to 1st
        a = a + b;
          
        System.out.println("hello a:"+a);
        // store initial string a in string b
        b = a.substring(0,a.length()-b.length());
          
        System.out.println("hello b:"+b);

        // store initial string b in string a
        a = a.substring(b.length());
        
        System.out.println("again a:"+a);

          
        // print String after swapping
        System.out.println("Strings after swap: a = " + 
                                     a + " and b = " + b);        

	}
}
