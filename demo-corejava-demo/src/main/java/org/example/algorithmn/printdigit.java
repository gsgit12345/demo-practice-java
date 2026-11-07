package org.example.algorithmn;


import java.util.Arrays;
import java.util.stream.IntStream;

public class printdigit {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 235723312;
        System.out.println(printDigit(n, 3));
        long count = IntStream.of(n).mapToObj(a -> (Integer) a).filter(a -> a == 3).count();
        System.out.println("bbb:" + count);
    }

    public static int printDigit(int number, int find) {
        int count = 0;

        while (number > 0) {
            int mod = number % 10;

            if (mod == find) {
                count++;
            }
            number = number / 10;
        }

        return count;
    }
}
