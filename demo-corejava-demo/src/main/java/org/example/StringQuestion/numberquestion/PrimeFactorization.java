package org.example.StringQuestion.numberquestion;

public class PrimeFactorization {
    public static void main(String str[])
    {
        int num=24;
        primeFactorization(num);
    }
    public static void primeFactorization(int number)
    {
        for(int div=2;div<number;div++)
        {
            while(number%div==0)
            {
                System.out.println("number is::"+div+" ");
                number=number/div;

            }
        }
        if(number!=1)
        {
            System.out.println("number is::"+number+" ");
        }
    }
}
