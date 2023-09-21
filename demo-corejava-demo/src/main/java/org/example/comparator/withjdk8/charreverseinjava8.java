package comparator.withjdk8;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class charreverseinjava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		charreverseinjava8 rev=new charreverseinjava8();
		//rev.reverse_character_in_words("Welcome to Techndeck.com");
		
		rev.reverse_words_in_String("Welcome to Techndeck.com");
        

		
	}
    public void reverse_character_in_words(String str) {
        String words[] = str.split(" ");

        Stream <String> streamOfWords = Arrays.stream(words);

        streamOfWords.forEach(w -> {

            System.out.println("Original word: " + w);

            Function <String,String> reverse = s -> new StringBuilder(s).reverse().toString();

            String reversedWord = reverse.apply(w);

            System.out.println("Reversed word: " + reversedWord + "\n");

        });

    }
    public static void reverse_words_in_String(String str) {
        String words[] = str.split(" ");

        StringBuilder sb = new StringBuilder();

        Stream <String> stream = Arrays.stream(words);

        stream.forEach(w -> {

            Function <String,String> reverse = s -> new StringBuilder(s).reverse().toString();

            String reversedWord = reverse.apply(w);

            sb.append(reversedWord + " ");
        });

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + sb);

    }

}
