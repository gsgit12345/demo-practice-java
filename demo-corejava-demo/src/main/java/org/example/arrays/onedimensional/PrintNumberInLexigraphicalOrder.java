package org.example.arrays.onedimensional;

public class PrintNumberInLexigraphicalOrder
{
    public static void main(String str[])
    {
        //https://www.youtube.com/watch?v=gRo86WqFYSE
        int n=100;
        for(int i=1;i<=9;i++) {
            dfc(i, n);
        }
    }
    public static void dfc(int i,int n)
    {
        if(i>n)
            return;
        System.out.print(i+"/");//here whatever the i value .it would printed first and j loop will print the family of i
        for(int j=0;j<10;j++)
        {
            dfc(10*i+j,n);
        }
    }
}
