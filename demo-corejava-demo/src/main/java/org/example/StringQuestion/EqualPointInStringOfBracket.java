package org.example.StringQuestion;

public class EqualPointInStringOfBracket {
    public static void main(String str[]) {
        //case1-
        String str1 = "(())))(";
        findEqualPointInStringOfBracket(str1);
        //case-2
        String str2 = "))";
        //  Output: 2
        // Explanation: As after 2nd position i.e. )) and “empty” string will be split into these two parts.
        //So, in this number of opening brackets i.e. 0 in the first part is equal to the number of closing
        //brackets in the second part i.e. also 0.
        //case:3
        String str3 = "(()))(()()())))";
        findEqualPointInStringOfBracket(str3);

        //another case file the balanced paranthesis
        String exp = "[()]{}{[()()]()}"; //balanced
        String expr = "{()}[]";//balanced
        String exp1 = "[(])";
        boolean balanced = checkBalancedBracketWithoutStack(exp1);
        if (balanced)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");

        boolean balance2 = isBalancedBracket(expr);
        if (balance2)
            System.out.println("Balanced1");
        else
            System.out.println("Not Balanced1");

        //   another scenario
                String str22 = ")))()";
        String str232 = "))))";

     String dd=   convertUnbalancedBracketSequenceIntoBalanced(str232);


     System.out.println("unbalanced to balanced:;"+dd);

    }

    public static void findEqualPointInStringOfBracket(String str) {
        //time :-big(n)
        //Auxiliary Space: O(1)
        int len = str.length();
        int openClosedBr = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                openClosedBr++;
            }
        }
        System.out.println("find the equal index::" + openClosedBr);
    }

    public static boolean isBalancedBracket(String st) {
        if (null == st || ((st.length() % 2) != 0)) {
            return false;
        } else {
            char[] ch = st.toCharArray();
            for (char c : ch) {
                if (!(c == '{' || c == '[' || c == '(' || c == '}' || c == ']' || c == ')')) {
                    return false;
                }
            }
        }
        while (st.contains("()") || st.contains("[]") || st.contains("{}")) {
            st = st.replaceAll("\\(\\)", "")
                    .replaceAll("\\[\\]", "")
                    .replaceAll("\\{\\}", "");
        }
        System.out.println("st is::" + st);
        return (st.length() == 0);
    }

    public static boolean checkBalancedBracketWithoutStack(String st) {
        //Time Complexity: O(N), Iteration over the string of size N one time.
        //Auxiliary Space: O(1)

        //  Initialize a variable index with -1.
        // Iterate through the string and
        // If it is an open bracket then increment the counter by 1 and replace ith character of the string with the opening bracket.
        //   Else if it is a closing bracket of the same corresponding opening bracket (opening bracket stored in exp[index]) then decrement index by 1.
        //At last, if we get index = -1, then the string is balanced and we will return true. Otherwise, the function will return false.

        int index = -1;
        char ch[] = new char[st.length()];
        for (char ch1 : st.toCharArray()) {
            if (ch1 == '{' || ch1 == '[' || ch1 == '(') {
                ch[++index] = ch1;

            } else {
                if (index >= 0 && (ch[index] == '{' && ch1 == '}') || (ch[index] == '[' && ch1 == ']') || (ch[index] == '(' && ch1 == ')')) {
                    index--;
                } else {
                    return false;
                }
            }
        }
        return index == -1;
    }

    public static String convertUnbalancedBracketSequenceIntoBalanced(String str) {

      //  Time Complexity: O(N)
       // Auxiliary Space: O(1)



        // Convert an unbalanced bracket sequence to a balanced sequence
        //    Given an unbalanced bracket sequence of ‘(‘ and ‘)’, convert it into a balanced sequence by adding the minimum number of ‘(‘ at the beginning of the string and ‘)’ at the end of the string.

        //  Examples:

        //Input: str = “)))()”
        //Output: “((()))()”

        //Input: str = “())())(())())”
        //Output: “(((())())(())())”

        int minCount = 0;
        int openingbracket = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                openingbracket++;
            } else {
                openingbracket--;
            }
        }

        if (minCount > openingbracket) {
            minCount = openingbracket;
        }
        if (minCount < 0) {
            for (int i = 0; i < Math.abs(minCount); i++)
                str = '(' + str;
        }
        openingbracket = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(')
                openingbracket++;
            else
                openingbracket--;
        }

        // if dep is not 0 then there
        // is need to add ')' at the back
        if (openingbracket != 0) {
            for (int i = 0; i < openingbracket; i++)
                str = str + ')';
        }
        return str;


    }
}
