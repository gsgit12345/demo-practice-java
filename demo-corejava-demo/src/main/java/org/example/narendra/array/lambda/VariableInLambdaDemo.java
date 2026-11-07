package org.example.narendra.array.lambda;
interface increment
{
    public int incrementNum(int num);
}
public class VariableInLambdaDemo {
    public static void main(String str[])
    {
        int number=10;
        increment increment=(n)->{
           int val=n+number;
          // number++;  it will give error here becaue variable number is final;
            return val;
        };

        System.out.println(increment.incrementNum(10));

    }
}
