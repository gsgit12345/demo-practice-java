package org.example.algorithmn;

import java.util.Scanner;

public class CountNumOfOccUInsentence {
	public static int countWords(String str)
    {
        int count = 1;
        for(int i=0; i<=str.length()-1; i++)
        {
            if(str.charAt(i) == ' ' && str.charAt(i+1)!=' ')
            {
                count++;
            }
        }
        return count;
    }
   public static void main(String args[])
   {
        String sentence="hello I am here to go outside of the scope";
       // Scanner scan = new Scanner(System.in);
        
      //  System.out.print("Enter a Sentence : ");
      //  sentence = scan.nextLine();
		
        System.out.print("Total Number of Words in Entered Sentence is " + countWords(sentence));
   }
}
