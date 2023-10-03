package org.example.subjectivec8.identityfunc;

import org.apache.logging.log4j.util.PropertySource;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AverageAndReverse {
    public static Scanner scanner;

    public static void main(String str[]) {
        // Average();
        //reverseCharacterInWord();
        //  secondWay();
        // traditionalApproach();
        String string = "hello i am here";
        //System.out.println(usingRecursion(string));
        // usingStream();
        //  reverseOrder();
     //  String str1= reverseOrderInStringUsingRecursion(string);
       //System.out.println("string is::"+str1);
        findProductOfTwoMaxNumber();
    }

    public static void Average() {
        List<Integer> list = Arrays.asList(4, 3, 2, 1, 5);
        OptionalDouble average = list.stream().mapToInt(num -> num.intValue()).average();
        System.out.println((int) average.getAsDouble());
        scanner = new Scanner(System.in);
        System.out.println("input the aray length");
        int length = scanner.nextInt();
        int[] array = new int[length];

        System.out.println("input the value");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        OptionalDouble arrayAverage = Arrays.stream(array).average();

        System.out.println("average of array::" + arrayAverage.getAsDouble());


    }

    public static void reverseCharacterInWord() {
        String phrase = "hello i am here";
        Stream<String> stream = Arrays.stream(phrase.split(" "));

        //  String dd="hello";
        //StringBuilder builder2 = new StringBuilder(dd).reverse();
        //System.out.println(builder2.toString());
        StringBuilder builder = new StringBuilder();
        stream.forEach(word -> {
                    Function<String, String> function = st -> new StringBuilder(st).reverse().toString();
                    String reversed = function.apply(word);
                    System.out.println(word);
                    builder.append(reversed + " ");

                }
        );

        System.out.println("reversed string::" + builder);
    }

    public static void secondWay() {
        String phrase = "hello i am here";
        String reversed = Arrays.stream(phrase.split(" ")).map(st -> new StringBuilder(st).reverse()).collect(Collectors.joining(" "));
        System.out.println("reversed::" + reversed);
    }

    public static void traditionalApproach() {
        String str = "hello i am here";
        if (str == null || str.isEmpty())
            throw new IllegalArgumentException("String is null or empty");
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        System.out.println("reversed string::" + reversed);
    }

    public static String usingRecursion(String string) {
        if (string == null || string.isEmpty() || string.length() < 2) {
            return string;
        }
        System.out.println(string.substring(1) + ":;" + string.charAt(0));
        return usingRecursion(string.substring(1)) + string.charAt(0);
    }

    public static void usingStream() {
        String str = "hello i am here";
        String st = IntStream.range(0, str.length()).map(i -> str.charAt(str.length() - i - 1)).peek(i -> System.out.print((char) i)).
                collect(StringBuilder::new, ((stringBuilder, c) -> stringBuilder.append((char) c)), StringBuilder::append).toString();

        System.out.println(" " + st);

    }

    public static void reverseOrder() {
        String st = "hello how are you";
//sorting the string
        String str = Arrays.stream(st.split(" ")).sorted(Comparator.comparing(word -> word.toString())).collect(Collectors.joining(" "));
        System.out.println("stris::" + str);
        String[] words = st.split(" ");
        StringBuilder reverseString = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reverseString.append(words[i]).append(" ");
        }
        System.out.println("reverseOrderOfWordsString = " + reverseString);

        List<String> list = Arrays.asList(st.split("[\\s]"));
        Collections.reverse(list);
        System.out.println(String.join(" ", list));

    }

    public static String reverseOrderInStringUsingRecursion(String str) {
        if (str == null || str.isEmpty())
            return str; //this is base condition
        String words[] = str.split(" ", 2);
        String remaining = "";
        String firstWord = words[0];
        if (words.length == 2) {
            remaining = words[1];
        } else {
            remaining = "";
        }

        return reverseOrderInStringUsingRecursion(remaining) + firstWord + " ";

    }
    public static void findProductOfTwoMaxNumber()
    {
        Integer array[]={2,3,1,4,5,9,8};

        Arrays.sort(array,Comparator.reverseOrder());
        int firstMax=array[0];
        int secondMax=array[1];
        int thirdMax=array[2];
        secondMax=13;
        int product=firstMax*secondMax;
        System.out.println("firstmax:;"+firstMax+":secondmax:"+secondMax);
        System.out.println("product of max number:;"+product);
//largest of three number

        if(firstMax>secondMax) {
            System.out.println("first"+ firstMax);
        }
        else if (secondMax>thirdMax) {
            System.out.println( "second:"+secondMax);
        }
        else
        {
            System.out.println("else:"+ firstMax);
        }

    }
}
