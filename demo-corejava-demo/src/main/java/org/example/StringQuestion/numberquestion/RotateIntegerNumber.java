package org.example.StringQuestion.numberquestion;

public class RotateIntegerNumber {
    public static void main(String str[])
    {
        int num=12345;
        int k=7;

       // rotateNumber(num,k);
        rotateNumberByK(num,k);
    }
    public static void rotateNumberByK(int N, int K)
    {
        //Time Complexity: O(N), where N is the number of digits in the given integer.
        //Space Complexity: O(N), as it involves creating a string representation of the integer and storing it in memory.
        // Convert N to a string
        String num = Integer.toString(N);
        int len = num.length();
        K=K%len;
        System.out.println("for big number is::"+K);
        //for the negative number
        if(K<0)
        {
            K=K+len;
            System.out.println("for negative number is:::"+K);
        }
        // Rotate the string
        if (K > 0) {
            String rotated
                    = num.substring(K) + num.substring(0, K);
            System.out.print(Integer.parseInt(rotated));
        }
        else {
            K = Math.abs(K);
            String rotated = num.substring(len - K)
                    + num.substring(0, len - K);
            System.out.print(Integer.parseInt(rotated));
        }
    }


    public static void rotateNumber(int number,int k)
    {
        //Time Complexity: O(log10N)
        //Auxiliary Space: O(1)
        //1-first count digit of number
        //2-execute the for loop till the mod
        //3-within for loop check if if(i<=k) then create divisor=divisor*10
        //in else part create multiplier=multiplier*10
        //4-find the remainder and quotient
        //5-remainder*multplier+quotient
        int mod=0;
        int temp=number;
        while(temp>0)
        {
            temp=temp/10;
            mod++;
        }

        //for big number
        k=k%mod;
        System.out.println("for big number is::"+k);
        //for the negative number
        if(k<0)
        {
            k=k+mod;
            System.out.println("for negative number is:::"+k);
        }
        int multiplier=1;
        int divisor=1;
        for(int i=1;i<=mod;i++)
        {
            if(i<=k)
            {
                divisor=divisor*10;
            }else
            {
                multiplier=multiplier*10;
            }
        }
        int quotient=number/divisor;
        int remainder=number%divisor;
        int rotateNum=remainder*multiplier+quotient;
        System.out.println("rotated number is::"+rotateNum);

    }
}

