package org.example.narendra.array.lambda;

import java.util.*;

public class SortingUsingLambdaFunctionbySecondDigit {
    public static void main(String str[])
    {


        List<Integer> integerList= Arrays.asList(28,19,41,12,23,12,67);

        //        // Sort the integers based on second digit
        Collections.sort(integerList,(a,b)->{
            return a%10 > b%10 ? 1 : -1;
        });

        System.out.println(integerList);
    }
}
