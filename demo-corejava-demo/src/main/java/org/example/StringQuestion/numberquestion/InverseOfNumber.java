package org.example.StringQuestion.numberquestion;

public class InverseOfNumber {
    public static void main(String str[])
    {
        //logic inverse of a number
//number=21453   here this 5 digit so in inverse digit would be 1 to 6 and no digit would be repeated
      //  21453  then  the position of number is 12345
        //pos   num
        //1      3
        //2       5
        //3       4
        //4       1
        //5        2
        //======= inverse of number,num  would  be  actual position  and  pos would be actual number===
        //pos   num(inverse of number-21453)
        //1      4
        //2      5
        //3       1
        //4       3
        //5       2

        //number=426135  :--here this 6 digit so in inverse digit would be 1 to 6 and no digit would be repeated
        //the position would be 123456
        //pos       num
        // 1        5
        //2          3
        //3          1
        //4          6
        //5          2
        //6          4
        //====  inverse of number , in above num  would actual position and pos would be actual number.in we had arrange number as per actual position
        //1       3 (inverse:-352614
        //2        5
        //3        2
        //4        6
        // 5       1
        //6        4

        //wrong input --139 -2,4,5,6,7,8  are missing

        int num=426135;
        int num1=21453;
        //23154
        inverseOfNumber(num1);
    }

    public static void inverseOfNumber(int number)
    {
        //https://www.youtube.com/watch?v=O7PlWc9lOzg&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=25
        int invertNum=0;
        int originalPlace=1;
        while(number!=0)
        {
            int originalDigit=number%10;
            int invertedDigit=originalPlace;
            int invertedPos=originalDigit;

            invertNum=invertNum+invertedDigit*(int)Math.pow(10,invertedPos-1);// if we want to put 5 at sec.pos. then 5*10powinvertedPos-1

            number=number/10;
                    originalPlace++;
        }

        System.out.println("invertNum:;"+invertNum);
    }
}
