package org.example.subjectivec8.identityfunc;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerExample {
    public static void main(String str[])
    {
       // joinStringWithBarSymbol();
        //joinStringWithPrifixAndPostFixSymbol();
       // joinUsingStringFunction();
       // convertingArrayIntoString();
        convertingArrayIntoString();
    }
    public static void joinStringWithBarSymbol()
    {
        StringJoiner stringJoiner = new StringJoiner("|");
        stringJoiner.add("Facebook");
        stringJoiner.add("Twitter");
        stringJoiner.add("YouTube");
        stringJoiner.add("WhatsApp");
        stringJoiner.add("LinkedIn");
        System.out.println("string with bar::"+stringJoiner);
    }
    public static void joinStringWithPrifixAndPostFixSymbol()
    {
        StringJoiner stringJoiner = new StringJoiner(",","[ "," ]");
        stringJoiner.add("Facebook");
        stringJoiner.add("Twitter");
        stringJoiner.add("YouTube");
        stringJoiner.add("WhatsApp");
        stringJoiner.add("LinkedIn");
        System.out.println("string with bar::"+stringJoiner);
    }
    public static void joinUsingStringFunction()
    {
        String joinedString = String.join(" | ", "Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        System.out.println(joinedString);

    }
    public static void convertingArrayIntoString()
    {
        String[] strArray = new String[] {"Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn"};
        String joinedString = String.join(" | ", strArray);
        System.out.println(joinedString);
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String joinedString2 = String.join(" | ", listOfStrings);

        System.out.println(joinedString2);

    }
    public static void Java8CollectorsJoining()
    {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String joinedString = listOfStrings.stream().collect(Collectors.joining());
        System.out.println(joinedString);
        List<String> listOfStrings2 = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String joinedString2 = listOfStrings.stream().collect(Collectors.joining(" | "));

        System.out.println(joinedString2);

    }

}
