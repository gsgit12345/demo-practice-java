package org.example.narendra.array.practiceonly;

public class ClimbingStaires70 {

    //https://www.youtube.com/watch?v=A6mOASLl2Dg
    //number of step
    public static void main(String str[]) {
        int count = countNumberOfStepsInClimingStaires(3);
        System.out.println(count);
    }

    public static int countNumberOfStepsInClimingStaires(int n) {
        if (n < 0) {
            return 0;
        }
        else if (n == 0) {
            return 1;
        }
        int first = countNumberOfStepsInClimingStaires(n - 1);
        int second = countNumberOfStepsInClimingStaires(n - 2);
        //int third = countNumberOfStepsInClimingStaires(n - 3);
        int total = first + second ;
        return total;
    }

    public static int countStares(int n)
    {
        if(n<3)
            return n;
        int a,b;
        for(int i=0;i<n;i++)
        {

        }
        return 0;
    }
}
