package org.example.narendra.array.lambda;

interface factorial {
    public int factorial(int a);
}

public class FactorialUsingLambda {
    public static void main(String str[]) {
        factorial fact = (n) ->
        {
            int fact1 = 1;
            for (int i = 1; i <= n; i++) {
                fact1 = fact1 * i;
            }
            return fact1;
        };

        System.out.println(fact.factorial(5));
    }
}
