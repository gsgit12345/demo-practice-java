package practice;

import java.util.Stack;

public class ReverseWordalongwithspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="i am in java world";
		reverseCharInWords(st);
	}
	static void reverseCharInWords(String str)
	{
	    Stack<Character> st=new Stack<Character>();
	  
	    // Traverse given string and push all
	    // characters to stack until we see a space.
	    for (int i = 0; i < str.length(); ++i) {
	        if (str.charAt(i) != ' ')
	            st.push(str.charAt(i));
	  
	        // When we see a space, we print
	        // contents of stack.
	        else {
	            while (st.empty() == false) {
	                System.out.print(st.pop());
	                 
	            }
	           System.out.print(" ");
	        }
	    }
	  
	    // Since there may not be space after
	    // last word.
	    while (st.empty() == false) {
	        System.out.print(st.pop());
	         
	    }
	}
}
