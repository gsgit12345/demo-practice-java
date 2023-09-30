package org.example.StringQuestion.numberquestion;

public class CountDigitAndReverseNum {
    public static void main(String str[])
    {
        int number=67543123;
        int n=100;
        //countDigit(number);
        //printDigitOneBYOne(number);
        reverseNumber(number);
        reverseNumberUsingRecursion(n);

    }
    public static void countDigit(int number)
    {
        int count=0;
        while(number!=0)
        {
            number=number/10;
            count++;
        }
        System.out.println("count is::"+count);
    }


    public static void printDigitOneBYOne(int number)
    {
        int count=0;
        int temp=number;
        while(temp!=0)
        {
            temp=temp/10;
            count++;
        }
        int divisior=(int) Math.pow(10,count-1);

        while(divisior!=0)
        {
            int remainder=number/divisior;
            System.out.println("number is::"+remainder);
            number=number%divisior;
            divisior=divisior/10;

        }

    }
    public static void reverseNumber(int number)
    {

        while(number>0)
        {
            int mod=number%10;
            System.out.print(mod+",");
            number=number/10;
        }
    }
    public static void reverseNumberUsingRecursion(int number)
    {
        if(number<=0)

            return ;


        int mod=number%10;
        System.out.print(mod);
        reverseNumberUsingRecursion(number/10);
    }
}
