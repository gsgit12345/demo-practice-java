package org.example.stringandarrayquestion;

import java.util.Arrays;
import java.util.Stack;

public class LexicgraphicKthSmallestAndLongestString {
    public static void main(String str[]) {
        char a = 'b';//a is smaller than b because a's ascii value is less than b's ascii value.
        System.out.println("a ascii value::" + (int) a);
        String str1 = "SIRNCZJHWF";
        //result::CJHWF
        int k = 5;
        lexicographicallySmallestSubsequence(str1, k);
        findKthSmalletSubsetInString(str1, k);
        int [] arr={3,1,2};
        int kth=2;
        //ans=[1,2]
        int [] arr1={3,5,2,6};
        int kth1=2;
        //ans:-[2,6]
        int [] arr2={2,4,3,3,5,4,9,6};
        int kth2=4;
        //ans:-[2,3,3,4]
        findKthSmalletSubsetInIntegerArray(arr2,kth2);
    }

    public static void lexicographicallySmallestSubsequence(String s, int k) {
        //step-1-take the length of the string and create a stack<Character>
        //step:-run the loop from i=0 to till n and check if stack is empty then put the character in the stack
        //step2-in else part take a while loop and put the condition 1-stack should not be empty.2- && str.charAt[i] is less from the top character of stack
        //like str.charAt[i] <stack.pop.3- && stack.size-1+n-i>k
        //3-remove the element from the stack like stack.pop
        //4-put a if condition and check if(stack.isEmty || stack.size<k) then add stack.add(str.charAt[i])
        //5-check if(!stack.isEmty()) if condition true then take above string variable and str=str+stack.pop();
        //6-reverse the string and return it.
        //7-in case of the integer array ,create int array and put the int value in array using while loop


        int n = s.length();
        // Initialising a variable to store the lexicographically smallest substring.
        Stack<Character> stack = new Stack<>();

        // Traversing the string.
        for (int i = 0; i < n; i++) {
            // In case the stack is empty.
            if (stack.isEmpty()) {
                stack.add(s.charAt(i));
            } else {
                // Iterating till the current character is less than the character at the top of the stack and checking if at
                // least K characters remain in the rest of the string.

                while ((!stack.isEmpty()) && (s.charAt(i) < stack.peek()) && (stack.size() - 1 + n - i >= k)) {
                    stack.pop();
                }

                // If the size of the stack is less than k, the character is pushed into it.
                if (stack.empty() || stack.size() < k) {
                    stack.push(s.charAt(i));
                }
            }
        }

        // Declaring a variable to store the final result.
        String result = "";

        // Iterating till the stack becomes empty.
        while (!stack.isEmpty()) {
            result = result + stack.pop();
        }
        System.out.println("resul before reverse" + result);
        // Reversing the string and printing it.
        result = new StringBuilder(result).reverse().toString();

        System.out.println(result);
    }


    public static void findKthSmalletSubsetInString(String str, int kth) {
    //    Time Complexity: O(N)
      //  Auxiliary Space: O(N)


        int len = str.length();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < len; i++) {
            if (stack.isEmpty()) {
                stack.add(str.charAt(i));
            } else {
                while ((!stack.isEmpty()) && (str.charAt(i) < stack.peek()) && (stack.size() - 1 + len - i >= kth)) {
                    stack.pop();
                }
                if (stack.isEmpty() || stack.size() <kth) {
                    stack.push(str.charAt(i));
                }
            }
        }
        //with using reverse method
        /*String ans="";
        while (!stack.isEmpty()) {
            ans = ans + stack.pop();

        }*/
        //without using reverse method
        char ans[]=new char[kth];
        int n=kth-1;
        while(n>=0)
        {
            ans[n--]=stack.pop();
        }
String st=new String(ans);
        System.out.println("second method::"+st);
      //  StringBuilder bf=new StringBuilder(st).reverse();
        //System.out.println("after second method::"+bf);

    }
    public static void findKthSmalletSubsetInIntegerArray(int[] intarr, int kth) {

int len=intarr.length;

Stack<Integer> stack = new Stack<>();

for(int i=0;i<len;i++)
{
    if(stack.isEmpty())
    {
        stack.add(intarr[i]);
    }else {
        while((stack.size()>0)&&(intarr[i]<stack.peek())&&(stack.size()-1+len-i>= kth)) //if put intarr[i]>stack[peek]. you will get the bigger subset in integer array
        {
            stack.pop();
        }
        if(stack.isEmpty()||stack.size()<kth)
        {
            stack.push(intarr[i]);
        }
    }

}
        int result[]=new int[kth];
        int k=kth-1;
        while(k>=0)
        {
            result[k--]=stack.pop();
        }

        System.out.println("smallest subset in integer array::"+Arrays.toString(result));
    }

}
