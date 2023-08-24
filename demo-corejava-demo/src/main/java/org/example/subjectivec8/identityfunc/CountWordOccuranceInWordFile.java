package org.example.subjectivec8.identityfunc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CountWordOccuranceInWordFile {
    public static void main(String str[]) throws IOException {
        // Regex that matches one or more consecutive whitespace characters
        Pattern pattern = Pattern.compile("\\s+");

        // count occurrences of each word in a Stream<String> sorted by word
        Map<String, Long> wordCounts =
                Files.lines(Paths.get("/home/iid/project/demo-practice-java/demo-corejava-demo/src/main/resources/word.txt"))
                        .map(line -> line.replaceAll("(?!')\\p{P}", ""))
                        .flatMap(line -> pattern.splitAsStream(line))
                        .collect(Collectors.groupingBy(String::toLowerCase,
                                TreeMap::new, Collectors.counting()));

        // display the words grouped by starting letter
       TreeMap word= wordCounts.entrySet()
                .stream()
                .collect(
                        Collectors.groupingBy(entry -> entry.getKey().charAt(0),
                                TreeMap::new, Collectors.toList()));
       System.out.println(wordCounts.toString());
       System.out.println(word.toString());

       //{a=[and=2, are=2], d=[doing=1], g=[going=1], h=[hello=1, how=1], i=[in=1, is=1], m=[market=1], t=[the=1], w=[what=1, where=1], y=[you=1]}

/*                .forEach((letter, wordList) ->
                {
                    System.out.printf("%n%C%n", letter);
                    wordList.stream().forEach(word -> System.out.printf(
                            "%13s: %d%n", word.getKey(), word.getValue()));
                });*/
    }

}

