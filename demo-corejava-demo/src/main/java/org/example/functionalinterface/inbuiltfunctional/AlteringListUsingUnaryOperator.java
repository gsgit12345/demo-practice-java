package org.example.functionalinterface.inbuiltfunctional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class AlteringListUsingUnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = math(list,
                x -> x * 2,
                x -> x + 1);

        System.out.println(result); // [3, 5, 7, 9, 11, 13, 15, 17, 19, 21]
        UnaryOperator<Integer>  integerUnaryOperator=(x)->x+10;
        BinaryOperator<Integer> binaryOperator=(b,m)->b+m;
        binaryOperator.apply(1,3);
        System.out.println(integerUnaryOperator.apply(10));

        List<Integer> list1=Arrays.asList(1,2,3,45);
    }

    public static <T> List<T> math(List<T> list,
                                   UnaryOperator<T> uo, UnaryOperator<T> uo2) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            result.add(uo.andThen(uo2).apply(t));
        }
        return result;
    }
}