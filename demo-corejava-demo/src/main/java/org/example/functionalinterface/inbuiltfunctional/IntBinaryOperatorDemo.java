package org.example.functionalinterface.inbuiltfunctional;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int result = math((numbers), 0, (a, b) -> a + b);

        System.out.println(result); // 55

        int result2 = math((numbers), 0, Integer::sum);

        System.out.println(result2); // 55

        
    }

    public static int math(int[] list, int init, IntBinaryOperator accumulator) {
        int result = init;
        for (int t : list) {
            result = accumulator.applyAsInt(result, t);
        }
        return result;
    }

}
